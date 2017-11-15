package bean;

import java.util.ArrayList;
import java.util.List;

public class TransferMatch  {

        private String matchId;         //	 	string	是	比赛id	如：201710301001
        private String matchNo;         //	 	string	是	比赛编码	如：周三 001
        private String league;          //	 	string	是	联赛名
        private String home;            //	string	是	主队名
        private String away;            //	string	是	客队名
        private String matchStatus;         //	 	 	int	是	比赛状态
        private String handicap;         //	 	 	int	是	比赛状态
        private String fullScore;         //
//        private List<TransferSp> spList;           // 是	sp列表

        public String getMatchId() {
            return matchId;
        }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public String getMatchNo() {
        return matchNo;
    }

    public void setMatchNo(String matchNo) {
        this.matchNo = matchNo;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public String getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }

//    public List<TransferSp> getSpList() {
//        return spList;
//    }
//
//    public void setSpList(List<TransferSp> spList) {
//        this.spList = spList;
//    }

    public String getFullScore() {
        return fullScore;
    }

    public void setFullScore(String fullScore) {
        this.fullScore = fullScore;
    }

    public String getHandicap() {
        return handicap;
    }

    public void setHandicap(String handicap) {
        this.handicap = handicap;
    }
}