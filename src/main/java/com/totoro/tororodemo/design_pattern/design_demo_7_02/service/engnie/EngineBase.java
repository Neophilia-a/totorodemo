package com.totoro.tororodemo.design_pattern.design_demo_7_02.service.engnie;

import com.totoro.tororodemo.design_pattern.design_demo_7_02.model.aggregates.TreeRich;
import com.totoro.tororodemo.design_pattern.design_demo_7_02.model.vo.EngineResult;
import com.totoro.tororodemo.design_pattern.design_demo_7_02.model.vo.TreeNode;
import com.totoro.tororodemo.design_pattern.design_demo_7_02.model.vo.TreeRoot;
import com.totoro.tororodemo.design_pattern.design_demo_7_02.service.logic.LogicFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 功能：基础决策引擎
 *
 * @author zhenghang
 * @date 2024/8/20
 */
public abstract class EngineBase extends EngineConfig implements IEngine{

    private Logger logger = LoggerFactory.getLogger(EngineBase.class);

    @Override
    public abstract EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter);

    protected TreeNode engineDecisionMaker(TreeRich treeRich, Long treeId, String userId, Map<String, String> decisionMatter) {
        TreeRoot treeRoot = treeRich.getTreeRoot();
        Map<Long, TreeNode> treeNodeMap = treeRich.getTreeNodeMap();
        // 规则树根ID
        Long rootNodeId = treeRoot.getTreeRootNodeId();
        TreeNode treeNodeInfo = treeNodeMap.get(rootNodeId);
        //节点类型[NodeType]；1子叶、2果实
        while (treeNodeInfo.getNodeType().equals(1)) {
            String ruleKey = treeNodeInfo.getRuleKey();
            LogicFilter logicFilter = logicFilterMap.get(ruleKey);
            String matterValue = logicFilter.matterValue(treeId, userId, decisionMatter);
            Long nextNode = logicFilter.filter(matterValue, treeNodeInfo.getTreeNodeLinkList());
            treeNodeInfo = treeNodeMap.get(nextNode);
            logger.info("决策树引擎=>{} userId：{} treeId：{} treeNode：{} ruleKey：{} matterValue：{}", treeRoot.getTreeName(), userId, treeId, treeNodeInfo.getTreeNodeId(), ruleKey, matterValue);
        }
        return treeNodeInfo;
    }
}
