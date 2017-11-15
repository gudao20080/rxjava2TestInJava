package bean;

public class TransferSp {

        private String playName;            //	string	是	玩法名称
        private String matchRet;            //	string	是	彩果	如：胜
        private String selects;         //	list	是	投注选项列表
        private String name;            //string	是	选项名称	如：胜
        private String jcSp;            //string	是	竞彩赔率	如：2.05
        private String addPercent;          //	string	是	加奖比例	如：0.039
        private String win;         //int	是	是否命中	0 否 1 是

    public String getPlayName() {
        return playName;
    }

    public void setPlayName(String playName) {
        this.playName = playName;
    }

    public String getMatchRet() {
        return matchRet;
    }

    public void setMatchRet(String matchRet) {
        this.matchRet = matchRet;
    }

    public String getSelects() {
        return selects;
    }

    public void setSelects(String selects) {
        this.selects = selects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJcSp() {
        return jcSp;
    }

    public void setJcSp(String jcSp) {
        this.jcSp = jcSp;
    }

    public String getAddPercent() {
        return addPercent;
    }

    public void setAddPercent(String addPercent) {
        this.addPercent = addPercent;
    }

    public String getWin() {
        return win;
    }



    public void setWin(String win) {
        this.win = win;
    }

}