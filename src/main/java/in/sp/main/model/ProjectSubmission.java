package in.sp.main.model;

public class ProjectSubmission {
    private String project_id; // it should be fk of type+season from AcademicProject
    private String title;
    private String description;
    private String github;
    private String section;
    private String group_name;
    private String leader;
    private String member2;
    private String member3;
    private String member4;
    private String member5;
    private String member6;
    private String presentation;
    private String documentation;
    private String projrct_zip;
    private String status;

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getMember2() {
        return member2;
    }

    public void setMember2(String member2) {
        this.member2 = member2;
    }

    public String getMember3() {
        return member3;
    }

    public void setMember3(String member3) {
        this.member3 = member3;
    }

    public String getMember4() {
        return member4;
    }

    public void setMember4(String member4) {
        this.member4 = member4;
    }

    public String getMember5() {
        return member5;
    }

    public void setMember5(String member5) {
        this.member5 = member5;
    }

    public String getMember6() {
        return member6;
    }

    public void setMember6(String member6) {
        this.member6 = member6;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public String getProjrct_zip() {
        return projrct_zip;
    }

    public void setProjrct_zip(String projrct_zip) {
        this.projrct_zip = projrct_zip;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
