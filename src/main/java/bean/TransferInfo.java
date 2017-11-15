package bean;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *<p>
 *    <a href="http://wiki.8win.com/pages/viewpage.action?pageId=14287805">101064 订单转让项</a>
 *</p>
 * @author WangKai
 */
public class TransferInfo{

    private String id;                //string	是	订单id
    private String amount;            // 	long	是	投注金额	单位：分
    private String multiple;            // 	long	是	倍数
    private String lotteryType;        // 	 	int	是	彩种编码	见101060-新投注 说明
    private String lotteryTypeName;    // 	 	 	string	是	彩种名称
    private String playType;            // 	int	是	玩法编码	见 101060-新投注 说明
    private String playTypeName;        // 	 	string	是	玩法名称
    private String phase;            // 	string	是	彩期
    private String orderType;        // 	 	int	是	订单类型	见 101060-新投注 说明
    private String orderTypeName;    // 	 	 	string	是	订单类型名称
    private String orderCreateType;    // 	 	 	int	是	订单创建类型	见 101060-新投注 说明
    private String orderCreateTypeName;             // 	 	 	string	是	订单创建类型名称
    private String orderWinningStatus;          // 	 	int	是	中奖状态编码	见 OrderWinningStatus说明
    private String orderWinningStatusName;          // 	 	 	string	是	中奖状态名称
    private String orderTicketStatus;           // 	int	是	出票状态编码	见 OrderTicketStatus说明
    private String orderTicketStatusName;           // 	 	string	是	出票状态名称
    private String orderPrizeStatus;            // 	int	是	派奖状态编码
    private String orderPrizeStatusName;            // 	 	string	是	派奖状态名称
    private String pretaxPrizeAmount;           // 	long	是	税前奖金	单位：分
    private String posttaxPrizeAmount;          // 	 	long	是	税后奖金	单位：分
    private String theoreticalMaxPrize;         // 	 	long	是	理论最高奖金	单位：分
    private String orderAddPrizeType;           // 	int	是	加奖类型编码
    private String orderAddPrizeTypeName;           // 	 	string	是	加奖类型名称
    private String addPrizeAmount;          // 	long	是	加奖金额	单位：分
    private String prizeTime;           //	string	是	派奖时间
    private String expectedPrizeTime;           //	 	 	string	是	预计开奖时间
    private String matchNums;           //	string	是	订单涉及的场次编号	多个编号以英文逗号分隔
    private String createdTime;         //	 	string	是	投注时间	格式如：2016-09-22 15:25:00
    private String transStatus;         //	 	int	是	转让状态	见 transStatus说明
    private String transAmount;         //	 	long	是	转让金额	单位：分
    private String resultMessage;         //	 	转让后的结果消息


    /**
     * 子列表是否展开
     */
    private boolean isExpand = false; //

    private List<TransferMatch> matchList;//	list	是	比赛列表

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMultiple() {
        return multiple;
    }

    public void setMultiple(String multiple) {
        this.multiple = multiple;
    }

    public String getLotteryType() {
        return lotteryType;
    }

    public void setLotteryType(String lotteryType) {
        this.lotteryType = lotteryType;
    }

    public String getLotteryTypeName() {
        return lotteryTypeName;
    }

    public void setLotteryTypeName(String lotteryTypeName) {
        this.lotteryTypeName = lotteryTypeName;
    }

    public String getPlayType() {
        return playType;
    }

    public void setPlayType(String playType) {
        this.playType = playType;
    }

    public String getPlayTypeName() {
        return playTypeName;
    }

    public void setPlayTypeName(String playTypeName) {
        this.playTypeName = playTypeName;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderTypeName() {
        return orderTypeName;
    }

    public void setOrderTypeName(String orderTypeName) {
        this.orderTypeName = orderTypeName;
    }

    public String getOrderCreateType() {
        return orderCreateType;
    }

    public void setOrderCreateType(String orderCreateType) {
        this.orderCreateType = orderCreateType;
    }

    public String getOrderCreateTypeName() {
        return orderCreateTypeName;
    }

    public void setOrderCreateTypeName(String orderCreateTypeName) {
        this.orderCreateTypeName = orderCreateTypeName;
    }

    public String getOrderWinningStatus() {
        return orderWinningStatus;
    }

    public void setOrderWinningStatus(String orderWinningStatus) {
        this.orderWinningStatus = orderWinningStatus;
    }

    public String getOrderWinningStatusName() {
        return orderWinningStatusName;
    }

    public void setOrderWinningStatusName(String orderWinningStatusName) {
        this.orderWinningStatusName = orderWinningStatusName;
    }

    public String getOrderTicketStatus() {
        return orderTicketStatus;
    }

    public void setOrderTicketStatus(String orderTicketStatus) {
        this.orderTicketStatus = orderTicketStatus;
    }

    public String getOrderTicketStatusName() {
        return orderTicketStatusName;
    }

    public void setOrderTicketStatusName(String orderTicketStatusName) {
        this.orderTicketStatusName = orderTicketStatusName;
    }

    public String getOrderPrizeStatus() {
        return orderPrizeStatus;
    }

    public void setOrderPrizeStatus(String orderPrizeStatus) {
        this.orderPrizeStatus = orderPrizeStatus;
    }

    public String getOrderPrizeStatusName() {
        return orderPrizeStatusName;
    }

    public void setOrderPrizeStatusName(String orderPrizeStatusName) {
        this.orderPrizeStatusName = orderPrizeStatusName;
    }

    public String getPretaxPrizeAmount() {
        return pretaxPrizeAmount;
    }

    public void setPretaxPrizeAmount(String pretaxPrizeAmount) {
        this.pretaxPrizeAmount = pretaxPrizeAmount;
    }

    public String getPosttaxPrizeAmount() {
        return posttaxPrizeAmount;
    }

    public void setPosttaxPrizeAmount(String posttaxPrizeAmount) {
        this.posttaxPrizeAmount = posttaxPrizeAmount;
    }

    public String getTheoreticalMaxPrize() {
        return theoreticalMaxPrize;
    }

    public void setTheoreticalMaxPrize(String theoreticalMaxPrize) {
        this.theoreticalMaxPrize = theoreticalMaxPrize;
    }

    public String getOrderAddPrizeType() {
        return orderAddPrizeType;
    }

    public void setOrderAddPrizeType(String orderAddPrizeType) {
        this.orderAddPrizeType = orderAddPrizeType;
    }

    public String getOrderAddPrizeTypeName() {
        return orderAddPrizeTypeName;
    }

    public void setOrderAddPrizeTypeName(String orderAddPrizeTypeName) {
        this.orderAddPrizeTypeName = orderAddPrizeTypeName;
    }

    public String getAddPrizeAmount() {
        return addPrizeAmount;
    }

    public void setAddPrizeAmount(String addPrizeAmount) {
        this.addPrizeAmount = addPrizeAmount;
    }

    public String getPrizeTime() {
        return prizeTime;
    }

    public void setPrizeTime(String prizeTime) {
        this.prizeTime = prizeTime;
    }

    public String getExpectedPrizeTime() {
        return expectedPrizeTime;
    }

    public void setExpectedPrizeTime(String expectedPrizeTime) {
        this.expectedPrizeTime = expectedPrizeTime;
    }

    public String getMatchNums() {
        return matchNums;
    }

    public void setMatchNums(String matchNums) {
        this.matchNums = matchNums;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(String transStatus) {
        this.transStatus = transStatus;
    }

    public String getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(String transAmount) {
        this.transAmount = transAmount;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public boolean isExpand() {
        return isExpand;
    }

    public void setExpand(boolean expand) {
        isExpand = expand;
    }

    public List<TransferMatch> getMatchList() {
        return matchList;
    }

    public void setMatchList(List<TransferMatch> matchList) {
        this.matchList = matchList;
    }
}
