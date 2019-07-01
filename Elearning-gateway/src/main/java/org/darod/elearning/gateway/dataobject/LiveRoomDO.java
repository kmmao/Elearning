package org.darod.elearning.gateway.dataobject;

import java.util.Date;

public class LiveRoomDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_room.id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_room.teacher_id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    private Integer teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_room.room_name
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    private Integer roomName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_room.room_description
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    private String roomDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_room.create_time
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_room.last_live_time
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    private Date lastLiveTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_room.id
     *
     * @return the value of live_room.id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_room.id
     *
     * @param id the value for live_room.id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_room.teacher_id
     *
     * @return the value of live_room.teacher_id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_room.teacher_id
     *
     * @param teacherId the value for live_room.teacher_id
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_room.room_name
     *
     * @return the value of live_room.room_name
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public Integer getRoomName() {
        return roomName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_room.room_name
     *
     * @param roomName the value for live_room.room_name
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public void setRoomName(Integer roomName) {
        this.roomName = roomName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_room.room_description
     *
     * @return the value of live_room.room_description
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public String getRoomDescription() {
        return roomDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_room.room_description
     *
     * @param roomDescription the value for live_room.room_description
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription == null ? null : roomDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_room.create_time
     *
     * @return the value of live_room.create_time
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_room.create_time
     *
     * @param createTime the value for live_room.create_time
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_room.last_live_time
     *
     * @return the value of live_room.last_live_time
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public Date getLastLiveTime() {
        return lastLiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_room.last_live_time
     *
     * @param lastLiveTime the value for live_room.last_live_time
     *
     * @mbg.generated Mon Jun 24 18:28:14 CST 2019
     */
    public void setLastLiveTime(Date lastLiveTime) {
        this.lastLiveTime = lastLiveTime;
    }
}