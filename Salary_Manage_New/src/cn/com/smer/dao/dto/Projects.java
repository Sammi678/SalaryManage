package cn.com.smer.dao.dto;

public class Projects {
    private Long projectId;

    private String projectName;

    private Short projectType;

    private Short show_status;

    private Long calculationId;

    private Short addorsubtract;

    private String remark;

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public Short getProjectType() {
        return projectType;
    }

    public void setProjectType(Short projectType) {
        this.projectType = projectType;
    }

    public Short getShow() {
        return show_status;
    }

    public void setShow(Short show_status) {
        this.show_status = show_status;
    }

    public Long getCalculationId() {
        return calculationId;
    }

    public void setCalculationId(Long calculationId) {
        this.calculationId = calculationId;
    }

    public Short getAddorsubtract() {
        return addorsubtract;
    }

    public void setAddorsubtract(Short addorsubtract) {
        this.addorsubtract = addorsubtract;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	@Override
	public String toString() {
		return "Projects [projectId=" + projectId + ", projectName=" + projectName + ", projectType=" + projectType
				+ ", show=" + show_status + ", calculationId=" + calculationId + ", addorsubtract=" + addorsubtract
				+ ", remark=" + remark + "]";
	}
    
}