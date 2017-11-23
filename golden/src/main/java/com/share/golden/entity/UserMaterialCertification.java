package com.share.golden.entity;

import java.util.Date;

public class UserMaterialCertification {
    private String materiaId;

    private String userId;

    private String materiaType;

    private String materia;

    private Date createDate;

    private String valid;

    public String getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(String materiaId) {
        this.materiaId = materiaId == null ? null : materiaId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getMateriaType() {
        return materiaType;
    }

    public void setMateriaType(String materiaType) {
        this.materiaType = materiaType == null ? null : materiaType.trim();
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia == null ? null : materia.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }
}