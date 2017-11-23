package com.share.golden.service.admin;

import java.util.List;

import com.share.golden.entity.UserMaterialCertification;
import com.share.golden.entity.UserMaterialCertificationExample;



public interface IUserMaterialCertificationService {
	public void insert( UserMaterialCertification userMaterialCertification );
	public void update( UserMaterialCertification userMaterialCertification );
	public void delete( String materiaId);
	public List< UserMaterialCertification> list( UserMaterialCertificationExample userMaterialCertificationExample);
	public  UserMaterialCertification select(String materiaId);

}
