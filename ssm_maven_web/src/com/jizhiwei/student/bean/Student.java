package com.jizhiwei.student.bean;

public class Student {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.s_id
     *
     * @mbg.generated Wed Aug 22 17:55:09 CST 2018
     */
    private Integer sId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.s_name
     *
     * @mbg.generated Wed Aug 22 17:55:09 CST 2018
     */
    private String sName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.s_sex
     *
     * @mbg.generated Wed Aug 22 17:55:09 CST 2018
     */
    private String sSex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.age
     *
     * @mbg.generated Wed Aug 22 17:55:09 CST 2018
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.email
     *
     * @mbg.generated Wed Aug 22 17:55:09 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.fk_s_t_id
     *
     * @mbg.generated Wed Aug 22 17:55:09 CST 2018
     */
    private Integer fkSTId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.s_id
     *
     * @return the value of student.s_id
     *
     * @mbg.generated Wed Aug 22 17:55:09 CST 2018
     */
    public Integer getsId() {
        return sId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.s_id
     *
     * @param sId the value for student.s_id
     *
     * @mbg.generated Wed Aug 22 17:55:09 CST 2018
     */
    public void setsId(Integer sId) {
        this.sId = sId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.s_name
     *
     * @return the value of student.s_name
     *
     * @mbg.generated Wed Aug 22 17:55:09 CST 2018
     */
    public String getsName() {
        return sName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.s_name
     *
     * @param sName the value for student.s_name
     *
     * @mbg.generated Wed Aug 22 17:55:09 CST 2018
     */
    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.s_sex
     *
     * @return the value of student.s_sex
     *
     * @mbg.generated Wed Aug 22 17:55:09 CST 2018
     */
    public String getsSex() {
        return sSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.s_sex
     *
     * @param sSex the value for student.s_sex
     *
     * @mbg.generated Wed Aug 22 17:55:09 CST 2018
     */
    public void setsSex(String sSex) {
        this.sSex = sSex == null ? null : sSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.age
     *
     * @return the value of student.age
     *
     * @mbg.generated Wed Aug 22 17:55:09 CST 2018
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.age
     *
     * @param age the value for student.age
     *
     * @mbg.generated Wed Aug 22 17:55:09 CST 2018
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.email
     *
     * @return the value of student.email
     *
     * @mbg.generated Wed Aug 22 17:55:09 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.email
     *
     * @param email the value for student.email
     *
     * @mbg.generated Wed Aug 22 17:55:09 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.fk_s_t_id
     *
     * @return the value of student.fk_s_t_id
     *
     * @mbg.generated Wed Aug 22 17:55:09 CST 2018
     */
    public Integer getFkSTId() {
        return fkSTId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.fk_s_t_id
     *
     * @param fkSTId the value for student.fk_s_t_id
     *
     * @mbg.generated Wed Aug 22 17:55:09 CST 2018
     */
    public void setFkSTId(Integer fkSTId) {
        this.fkSTId = fkSTId;
    }
}