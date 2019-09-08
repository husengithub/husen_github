package com.example.springdemo.pojo;

public class DepeePOJO {
//        编号
    private int depNo;
//        名称
    private String depName;

    public int getDepNo() {
        return depNo;
    }

    public void setDepNo(int depNo) {
        this.depNo = depNo;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    @Override
    public String toString() {
        return "DepleePOJO{" +
                "depNo=" + depNo +
                ", depName='" + depName + '\'' +
                '}';
    }
}
