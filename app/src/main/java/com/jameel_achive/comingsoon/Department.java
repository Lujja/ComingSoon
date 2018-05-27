package com.jameel_achive.comingsoon;

public class Department {

    private String mDepartmentName;
    private String mDepartmentInfo;
    private int mImageResourceId;

    public Department(String departmentName, String departmentInfo, int departmentImage){
        mDepartmentName = departmentName;
        mDepartmentInfo = departmentInfo;
        mImageResourceId = departmentImage;
    }

    public String getmDepartmentName() {
        return mDepartmentName;
    }

    public void setmDepartmentName(String mDepartmentName) {
        this.mDepartmentName = mDepartmentName;
    }

    public String getmDepartmentInfo() {
        return mDepartmentInfo;
    }

    public void setmDepartmentInfo(String mDepartmentInfo) {
        this.mDepartmentInfo = mDepartmentInfo;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }
}
