package com.mashen.customer.domain;

import java.io.Serializable;
import java.util.Date;

public class CustomerVO implements Serializable {
    private Integer customerId;

    private String name;

    private Integer sex;

    private String phone;

    private String profession;

    private String degree;

    private String graduationtime;

    private String status;

    private String source;

    private String isopen;

    private String baseinfo;

    private String economicinfo;

    private String loaninf;

    private Date ctime;

    private Date lastmodifytime;

    private String creatorDepartmentId;

    private String creatorUserId;

    private String firstCreatorUserId;

    private static final long serialVersionUID = 1L;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getGraduationtime() {
        return graduationtime;
    }

    public void setGraduationtime(String graduationtime) {
        this.graduationtime = graduationtime == null ? null : graduationtime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getIsopen() {
        return isopen;
    }

    public void setIsopen(String isopen) {
        this.isopen = isopen == null ? null : isopen.trim();
    }

    public String getBaseinfo() {
        return baseinfo;
    }

    public void setBaseinfo(String baseinfo) {
        this.baseinfo = baseinfo == null ? null : baseinfo.trim();
    }

    public String getEconomicinfo() {
        return economicinfo;
    }

    public void setEconomicinfo(String economicinfo) {
        this.economicinfo = economicinfo == null ? null : economicinfo.trim();
    }

    public String getLoaninf() {
        return loaninf;
    }

    public void setLoaninf(String loaninf) {
        this.loaninf = loaninf == null ? null : loaninf.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getLastmodifytime() {
        return lastmodifytime;
    }

    public void setLastmodifytime(Date lastmodifytime) {
        this.lastmodifytime = lastmodifytime;
    }

    public String getCreatorDepartmentId() {
        return creatorDepartmentId;
    }

    public void setCreatorDepartmentId(String creatorDepartmentId) {
        this.creatorDepartmentId = creatorDepartmentId == null ? null : creatorDepartmentId.trim();
    }

    public String getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId == null ? null : creatorUserId.trim();
    }

    public String getFirstCreatorUserId() {
        return firstCreatorUserId;
    }

    public void setFirstCreatorUserId(String firstCreatorUserId) {
        this.firstCreatorUserId = firstCreatorUserId == null ? null : firstCreatorUserId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerId=").append(customerId);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", phone=").append(phone);
        sb.append(", profession=").append(profession);
        sb.append(", degree=").append(degree);
        sb.append(", graduationtime=").append(graduationtime);
        sb.append(", status=").append(status);
        sb.append(", source=").append(source);
        sb.append(", isopen=").append(isopen);
        sb.append(", baseinfo=").append(baseinfo);
        sb.append(", economicinfo=").append(economicinfo);
        sb.append(", loaninf=").append(loaninf);
        sb.append(", ctime=").append(ctime);
        sb.append(", lastmodifytime=").append(lastmodifytime);
        sb.append(", creatorDepartmentId=").append(creatorDepartmentId);
        sb.append(", creatorUserId=").append(creatorUserId);
        sb.append(", firstCreatorUserId=").append(firstCreatorUserId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CustomerVO other = (CustomerVO) that;
        return (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getProfession() == null ? other.getProfession() == null : this.getProfession().equals(other.getProfession()))
            && (this.getDegree() == null ? other.getDegree() == null : this.getDegree().equals(other.getDegree()))
            && (this.getGraduationtime() == null ? other.getGraduationtime() == null : this.getGraduationtime().equals(other.getGraduationtime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getIsopen() == null ? other.getIsopen() == null : this.getIsopen().equals(other.getIsopen()))
            && (this.getBaseinfo() == null ? other.getBaseinfo() == null : this.getBaseinfo().equals(other.getBaseinfo()))
            && (this.getEconomicinfo() == null ? other.getEconomicinfo() == null : this.getEconomicinfo().equals(other.getEconomicinfo()))
            && (this.getLoaninf() == null ? other.getLoaninf() == null : this.getLoaninf().equals(other.getLoaninf()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()))
            && (this.getCreatorDepartmentId() == null ? other.getCreatorDepartmentId() == null : this.getCreatorDepartmentId().equals(other.getCreatorDepartmentId()))
            && (this.getCreatorUserId() == null ? other.getCreatorUserId() == null : this.getCreatorUserId().equals(other.getCreatorUserId()))
            && (this.getFirstCreatorUserId() == null ? other.getFirstCreatorUserId() == null : this.getFirstCreatorUserId().equals(other.getFirstCreatorUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getProfession() == null) ? 0 : getProfession().hashCode());
        result = prime * result + ((getDegree() == null) ? 0 : getDegree().hashCode());
        result = prime * result + ((getGraduationtime() == null) ? 0 : getGraduationtime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getIsopen() == null) ? 0 : getIsopen().hashCode());
        result = prime * result + ((getBaseinfo() == null) ? 0 : getBaseinfo().hashCode());
        result = prime * result + ((getEconomicinfo() == null) ? 0 : getEconomicinfo().hashCode());
        result = prime * result + ((getLoaninf() == null) ? 0 : getLoaninf().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        result = prime * result + ((getCreatorDepartmentId() == null) ? 0 : getCreatorDepartmentId().hashCode());
        result = prime * result + ((getCreatorUserId() == null) ? 0 : getCreatorUserId().hashCode());
        result = prime * result + ((getFirstCreatorUserId() == null) ? 0 : getFirstCreatorUserId().hashCode());
        return result;
    }
}