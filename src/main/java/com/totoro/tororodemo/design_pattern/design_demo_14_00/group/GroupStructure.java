package com.totoro.tororodemo.design_pattern.design_demo_14_00.group;

import com.totoro.tororodemo.design_pattern.design_demo_14_00.lang.Collection;
import com.totoro.tororodemo.design_pattern.design_demo_14_00.lang.Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能：迭代器功能实现
 *
 * @author zhenghang
 * @date 2024/9/21
 */
public class GroupStructure implements Collection<Employee, Link> {

    // 组织id
    private String groupId;

    // 组织名称
    private String groupName;

    // 雇员列表
    private Map<String, Employee> employeeMap = new HashMap<>();

    // 组织架构关系 id --> list
    private Map<String, List<Link>> linkMap = new HashMap<>();

    // 反向关系链
    private Map<String, String> invertedMap = new HashMap<>();

    public GroupStructure(String groupId, String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }

    @Override
    public boolean add(Employee employee) {
        return null != employeeMap.put(employee.getUId(), employee);
    }

    @Override
    public boolean remove(Employee employee) {
        return null != employeeMap.remove(employee.getUId());
    }

    @Override
    public boolean addLink(String key, Link link) {
        invertedMap.put(link.getToId(), link.getFromId());
        if (linkMap.containsKey(key)) {
            return linkMap.get(key).add(link);
        } else {
            List<Link> list = new ArrayList<>();
            list.add(link);
            linkMap.put(key, list);
            return true;
        }
    }

    @Override
    public boolean removeLink(String key) {

        return null != linkMap.remove(key);
    }

    @Override
    public Iterator<Employee> iterator() {
        return new Iterator<Employee>() {

            Map<String, Integer> keyMap = new HashMap<>();
            int totalIdx = 0;

            private String fromId = groupId;
            private String toId = groupId;

            @Override
            public boolean hasNext() {
                return totalIdx < employeeMap.size();
            }

            @Override
            public Employee next() {
                List<Link> links = linkMap.get(toId);
                int cursorIdx = getCursorIdx(toId);
                // 同级节点扫描
                if (null == links) {
                    cursorIdx = getCursorIdx(fromId);
                    links = linkMap.get(fromId);
                }
                // 上级节点扫描
                while (cursorIdx > links.size() - 1) {
                    fromId = invertedMap.get(fromId);
                    cursorIdx = getCursorIdx(fromId);
                    links = linkMap.get(fromId);

                }
                Link link = links.get(cursorIdx);
                toId = link.getToId();
                fromId = link.getFromId();
                totalIdx++;
                return employeeMap.get(link.getToId());
            }

            public int getCursorIdx(String key) {
                int idx = 0;
                if (keyMap.containsKey(key)) {
                    idx = keyMap.get(key);
                    keyMap.put(key, ++idx);
                } else {
                    keyMap.put(key, idx);
                }
                return idx;
            }
        };
    }
}
