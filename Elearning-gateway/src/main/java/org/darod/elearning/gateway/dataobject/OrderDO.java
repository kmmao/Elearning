package org.darod.elearning.gateway.dataobject;

import java.util.Date;

public class OrderDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.order_id
     *
     * @mbg.generated Mon Jul 15 12:54:50 CST 2019
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.user_id
     *
     * @mbg.generated Mon Jul 15 12:54:50 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.course_id
     *
     * @mbg.generated Mon Jul 15 12:54:50 CST 2019
     */
    private Integer courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.create_time
     *
     * @mbg.generated Mon Jul 15 12:54:50 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.pay_time
     *
     * @mbg.generated Mon Jul 15 12:54:50 CST 2019
     */
    private Date payTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.order_state
     *
     * @mbg.generated Mon Jul 15 12:54:50 CST 2019
     */
    private Integer orderState;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.order_id
     *
     * @return the value of order_info.order_id
     *
     * @mbg.generated Mon Jul 15 12:54:50 CST 2019
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.order_id
     *
     * @param orderId the value for order_info.order_id
     *
     * @mbg.generated Mon Jul 15 12:54:50 CST 2019
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.user_id
     *
     * @return the value of order_info.user_id
     *
     * @mbg.generated Mon Jul 15 12:54:50 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.user_id
     *
     * @param userId the value for order_info.user_id
     *
     * @mbg.generated Mon Jul 15 12:54:50 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.course_id
     *
     * @return the value of order_info.course_id
     *
     * @mbg.generated Mon Jul 15 12:54:50 CST 2019
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.course_id
     *
     * @param courseId the value for order_info.course_id
     *
     * @mbg.generated Mon Jul 15 12:54:50 CST 2019
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.create_time
     *
     * @return the value of order_info.create_time
     *
     * @mbg.generated Mon Jul 15 12:54:50 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.create_time
     *
     * @param createTime the value for order_info.create_time
     *
     * @mbg.generated Mon Jul 15 12:54:50 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.pay_time
     *
     * @return the value of order_info.pay_time
     *
     * @mbg.generated Mon Jul 15 12:54:50 CST 2019
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.pay_time
     *
     * @param payTime the value for order_info.pay_time
     *
     * @mbg.generated Mon Jul 15 12:54:50 CST 2019
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.order_state
     *
     * @return the value of order_info.order_state
     *
     * @mbg.generated Mon Jul 15 12:54:50 CST 2019
     */
    public Integer getOrderState() {
        return orderState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.order_state
     *
     * @param orderState the value for order_info.order_state
     *
     * @mbg.generated Mon Jul 15 12:54:50 CST 2019
     */
    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }
}