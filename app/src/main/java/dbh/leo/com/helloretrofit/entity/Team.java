package dbh.leo.com.helloretrofit.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by leo on 2016/5/23.
 */
public class Team implements Serializable{
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("tagid")
    @Expose
    private Integer tagid;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("eng_name")
    @Expose
    private String engName;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("eng_full_name")
    @Expose
    private String engFullName;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("bbr")
    @Expose
    private String bbr;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("home")
    @Expose
    private String home;
    @SerializedName("homepage_link")
    @Expose
    private String homepageLink;
    @SerializedName("intro")
    @Expose
    private String intro;
    @SerializedName("conference")
    @Expose
    private String conference;
    @SerializedName("eng_division")
    @Expose
    private String engDivision;
    @SerializedName("cn_division")
    @Expose
    private String cnDivision;
    @SerializedName("stoped")
    @Expose
    private Integer stoped;
    @SerializedName("chief_coach")
    @Expose
    private String chiefCoach;
    @SerializedName("found_year")
    @Expose
    private Integer foundYear;
    @SerializedName("players")
    @Expose
    private String players;
    @SerializedName("stadiums")
    @Expose
    private Object stadiums;
    @SerializedName("team_link")
    @Expose
    private String teamLink;
    @SerializedName("logo_link")
    @Expose
    private String logoLink;
    @SerializedName("stadiumsInfo")
    @Expose
    private List<StadiumsInfo> stadiumsInfo = new ArrayList<StadiumsInfo>();

    /**
     *
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     *     The tagid
     */
    public Integer getTagid() {
        return tagid;
    }

    /**
     *
     * @param tagid
     *     The tagid
     */
    public void setTagid(Integer tagid) {
        this.tagid = tagid;
    }

    /**
     *
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     *     The engName
     */
    public String getEngName() {
        return engName;
    }

    /**
     *
     * @param engName
     *     The eng_name
     */
    public void setEngName(String engName) {
        this.engName = engName;
    }

    /**
     *
     * @return
     *     The fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     *
     * @param fullName
     *     The full_name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     *
     * @return
     *     The engFullName
     */
    public String getEngFullName() {
        return engFullName;
    }

    /**
     *
     * @param engFullName
     *     The eng_full_name
     */
    public void setEngFullName(String engFullName) {
        this.engFullName = engFullName;
    }

    /**
     *
     * @return
     *     The city
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     *     The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     *     The bbr
     */
    public String getBbr() {
        return bbr;
    }

    /**
     *
     * @param bbr
     *     The bbr
     */
    public void setBbr(String bbr) {
        this.bbr = bbr;
    }

    /**
     *
     * @return
     *     The logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     *
     * @param logo
     *     The logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     *
     * @return
     *     The home
     */
    public String getHome() {
        return home;
    }

    /**
     *
     * @param home
     *     The home
     */
    public void setHome(String home) {
        this.home = home;
    }

    /**
     *
     * @return
     *     The homepageLink
     */
    public String getHomepageLink() {
        return homepageLink;
    }

    /**
     *
     * @param homepageLink
     *     The homepage_link
     */
    public void setHomepageLink(String homepageLink) {
        this.homepageLink = homepageLink;
    }

    /**
     *
     * @return
     *     The intro
     */
    public String getIntro() {
        return intro;
    }

    /**
     *
     * @param intro
     *     The intro
     */
    public void setIntro(String intro) {
        this.intro = intro;
    }

    /**
     *
     * @return
     *     The conference
     */
    public String getConference() {
        return conference;
    }

    /**
     *
     * @param conference
     *     The conference
     */
    public void setConference(String conference) {
        this.conference = conference;
    }

    /**
     *
     * @return
     *     The engDivision
     */
    public String getEngDivision() {
        return engDivision;
    }

    /**
     *
     * @param engDivision
     *     The eng_division
     */
    public void setEngDivision(String engDivision) {
        this.engDivision = engDivision;
    }

    /**
     *
     * @return
     *     The cnDivision
     */
    public String getCnDivision() {
        return cnDivision;
    }

    /**
     *
     * @param cnDivision
     *     The cn_division
     */
    public void setCnDivision(String cnDivision) {
        this.cnDivision = cnDivision;
    }

    /**
     *
     * @return
     *     The stoped
     */
    public Integer getStoped() {
        return stoped;
    }

    /**
     *
     * @param stoped
     *     The stoped
     */
    public void setStoped(Integer stoped) {
        this.stoped = stoped;
    }

    /**
     *
     * @return
     *     The chiefCoach
     */
    public String getChiefCoach() {
        return chiefCoach;
    }

    /**
     *
     * @param chiefCoach
     *     The chief_coach
     */
    public void setChiefCoach(String chiefCoach) {
        this.chiefCoach = chiefCoach;
    }

    /**
     *
     * @return
     *     The foundYear
     */
    public Integer getFoundYear() {
        return foundYear;
    }

    /**
     *
     * @param foundYear
     *     The found_year
     */
    public void setFoundYear(Integer foundYear) {
        this.foundYear = foundYear;
    }

    /**
     *
     * @return
     *     The players
     */
    public String getPlayers() {
        return players;
    }

    /**
     *
     * @param players
     *     The players
     */
    public void setPlayers(String players) {
        this.players = players;
    }

    /**
     *
     * @return
     *     The stadiums
     */
    public Object getStadiums() {
        return stadiums;
    }

    /**
     *
     * @param stadiums
     *     The stadiums
     */
    public void setStadiums(Object stadiums) {
        this.stadiums = stadiums;
    }

    /**
     *
     * @return
     *     The teamLink
     */
    public String getTeamLink() {
        return teamLink;
    }

    /**
     *
     * @param teamLink
     *     The team_link
     */
    public void setTeamLink(String teamLink) {
        this.teamLink = teamLink;
    }

    /**
     *
     * @return
     *     The logoLink
     */
    public String getLogoLink() {
        return logoLink;
    }

    /**
     *
     * @param logoLink
     *     The logo_link
     */
    public void setLogoLink(String logoLink) {
        this.logoLink = logoLink;
    }

    /**
     *
     * @return
     *     The stadiumsInfo
     */
    public List<StadiumsInfo> getStadiumsInfo() {
        return stadiumsInfo;
    }

    /**
     *
     * @param stadiumsInfo
     *     The stadiumsInfo
     */
    public void setStadiumsInfo(List<StadiumsInfo> stadiumsInfo) {
        this.stadiumsInfo = stadiumsInfo;
    }

    private class StadiumsInfo implements Serializable{

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("eng_name")
        @Expose
        private String engName;
        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("state")
        @Expose
        private String state;
        @SerializedName("capacity")
        @Expose
        private Integer capacity;

        /**
         *
         * @return
         *     The id
         */
        public Integer getId() {
            return id;
        }

        /**
         *
         * @param id
         *     The id
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         *
         * @return
         *     The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         *     The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         *
         * @return
         *     The engName
         */
        public String getEngName() {
            return engName;
        }

        /**
         *
         * @param engName
         *     The eng_name
         */
        public void setEngName(String engName) {
            this.engName = engName;
        }

        /**
         *
         * @return
         *     The city
         */
        public String getCity() {
            return city;
        }

        /**
         *
         * @param city
         *     The city
         */
        public void setCity(String city) {
            this.city = city;
        }

        /**
         *
         * @return
         *     The state
         */
        public String getState() {
            return state;
        }

        /**
         *
         * @param state
         *     The state
         */
        public void setState(String state) {
            this.state = state;
        }

        /**
         *
         * @return
         *     The capacity
         */
        public Integer getCapacity() {
            return capacity;
        }

        /**
         *
         * @param capacity
         *     The capacity
         */
        public void setCapacity(Integer capacity) {
            this.capacity = capacity;
        }
    }
}
