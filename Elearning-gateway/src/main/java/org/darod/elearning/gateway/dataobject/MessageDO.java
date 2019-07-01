package org.darod.elearning.gateway.dataobject;

import java.util.Date;

public class MessageDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.message_type
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    private Byte messageType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.message_time
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    private Date messageTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.message_content
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    private String messageContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.message_state
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    private Byte messageState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.sender_id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    private Integer senderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.receiver_id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    private Integer receiverId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.id
     *
     * @return the value of message.id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.id
     *
     * @param id the value for message.id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.message_type
     *
     * @return the value of message.message_type
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public Byte getMessageType() {
        return messageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.message_type
     *
     * @param messageType the value for message.message_type
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public void setMessageType(Byte messageType) {
        this.messageType = messageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.message_time
     *
     * @return the value of message.message_time
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public Date getMessageTime() {
        return messageTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.message_time
     *
     * @param messageTime the value for message.message_time
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public void setMessageTime(Date messageTime) {
        this.messageTime = messageTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.message_content
     *
     * @return the value of message.message_content
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public String getMessageContent() {
        return messageContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.message_content
     *
     * @param messageContent the value for message.message_content
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.message_state
     *
     * @return the value of message.message_state
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public Byte getMessageState() {
        return messageState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.message_state
     *
     * @param messageState the value for message.message_state
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public void setMessageState(Byte messageState) {
        this.messageState = messageState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.sender_id
     *
     * @return the value of message.sender_id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public Integer getSenderId() {
        return senderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.sender_id
     *
     * @param senderId the value for message.sender_id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.receiver_id
     *
     * @return the value of message.receiver_id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public Integer getReceiverId() {
        return receiverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.receiver_id
     *
     * @param receiverId the value for message.receiver_id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }
}