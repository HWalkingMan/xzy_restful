package xzydemo.demo.domain;

public class Account1DO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.accountId
     *
     * @mbg.generated Sun Oct 20 21:55:03 CST 2019
     */
    private String accountid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.name
     *
     * @mbg.generated Sun Oct 20 21:55:03 CST 2019
     */
    private String realname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.age
     *
     * @mbg.generated Sun Oct 20 21:55:03 CST 2019
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.has_married
     *
     * @mbg.generated Sun Oct 20 21:55:03 CST 2019
     */
    private Byte hasMarried;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.province
     *
     * @mbg.generated Sun Oct 20 21:55:03 CST 2019
     */
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.addr
     *
     * @mbg.generated Sun Oct 20 21:55:03 CST 2019
     */
    private String addr;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.accountId
     *
     * @return the value of account.accountId
     *
     * @mbg.generated Sun Oct 20 21:55:03 CST 2019
     */
    public String getAccountid() {
        return accountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.accountId
     *
     * @param accountid the value for account.accountId
     *
     * @mbg.generated Sun Oct 20 21:55:03 CST 2019
     */
    public void setAccountid(String accountid) {
        this.accountid = accountid == null ? null : accountid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.name
     *
     * @return the value of account.name
     *
     * @mbg.generated Sun Oct 20 21:55:03 CST 2019
     */
    public String getName() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.name
     *
     * @param realname the value for account.name
     *
     * @mbg.generated Sun Oct 20 21:55:03 CST 2019
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.age
     *
     * @return the value of account.age
     *
     * @mbg.generated Sun Oct 20 21:55:03 CST 2019
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.age
     *
     * @param age the value for account.age
     *
     * @mbg.generated Sun Oct 20 21:55:03 CST 2019
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.has_married
     *
     * @return the value of account.has_married
     *
     * @mbg.generated Sun Oct 20 21:55:03 CST 2019
     */
    public Byte getHasMarried() {
        return hasMarried;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.has_married
     *
     * @param hasMarried the value for account.has_married
     *
     * @mbg.generated Sun Oct 20 21:55:03 CST 2019
     */
    public void setHasMarried(Byte hasMarried) {
        this.hasMarried = hasMarried;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.province
     *
     * @return the value of account.province
     *
     * @mbg.generated Sun Oct 20 21:55:03 CST 2019
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.province
     *
     * @param province the value for account.province
     *
     * @mbg.generated Sun Oct 20 21:55:03 CST 2019
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.addr
     *
     * @return the value of account.addr
     *
     * @mbg.generated Sun Oct 20 21:55:03 CST 2019
     */
    public String getAddr() {
        return addr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.addr
     *
     * @param addr the value for account.addr
     *
     * @mbg.generated Sun Oct 20 21:55:03 CST 2019
     */
    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }
}