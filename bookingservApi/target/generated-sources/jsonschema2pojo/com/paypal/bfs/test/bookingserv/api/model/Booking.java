
package com.paypal.bfs.test.bookingserv.api.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Booking resource
 * <p>
 * Booking resource object
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "first_name",
    "last_name",
    "date_of_birth",
    "checkin_datetime",
    "checkout_datetime",
    "totalprice",
    "deposit",
    "address"
})
public class Booking {

    /**
     * Booking id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Booking id")
    private Integer id;
    /**
     * First name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    @JsonPropertyDescription("First name")
    private String firstName;
    /**
     * Last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    @JsonPropertyDescription("Last name")
    private String lastName;
    /**
     * date of birth
     * (Required)
     * 
     */
    @JsonProperty("date_of_birth")
    @JsonPropertyDescription("date of birth")
    private Object dateOfBirth;
    /**
     * checkin time
     * (Required)
     * 
     */
    @JsonProperty("checkin_datetime")
    @JsonPropertyDescription("checkin time")
    private Object checkinDatetime;
    /**
     * checkout time
     * (Required)
     * 
     */
    @JsonProperty("checkout_datetime")
    @JsonPropertyDescription("checkout time")
    private String checkoutDatetime;
    /**
     * Total Price
     * (Required)
     * 
     */
    @JsonProperty("totalprice")
    @JsonPropertyDescription("Total Price")
    private Object totalprice;
    /**
     * total deposit amount
     * (Required)
     * 
     */
    @JsonProperty("deposit")
    @JsonPropertyDescription("total deposit amount")
    private Object deposit;
    /**
     * Address
     * (Required)
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("Address")
    private Address address;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Booking id
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Booking id
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * First name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * date of birth
     * (Required)
     * 
     */
    @JsonProperty("date_of_birth")
    public Object getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * date of birth
     * (Required)
     * 
     */
    @JsonProperty("date_of_birth")
    public void setDateOfBirth(Object dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * checkin time
     * (Required)
     * 
     */
    @JsonProperty("checkin_datetime")
    public Object getCheckinDatetime() {
        return checkinDatetime;
    }

    /**
     * checkin time
     * (Required)
     * 
     */
    @JsonProperty("checkin_datetime")
    public void setCheckinDatetime(Object checkinDatetime) {
        this.checkinDatetime = checkinDatetime;
    }

    /**
     * checkout time
     * (Required)
     * 
     */
    @JsonProperty("checkout_datetime")
    public String getCheckoutDatetime() {
        return checkoutDatetime;
    }

    /**
     * checkout time
     * (Required)
     * 
     */
    @JsonProperty("checkout_datetime")
    public void setCheckoutDatetime(String checkoutDatetime) {
        this.checkoutDatetime = checkoutDatetime;
    }

    /**
     * Total Price
     * (Required)
     * 
     */
    @JsonProperty("totalprice")
    public Object getTotalprice() {
        return totalprice;
    }

    /**
     * Total Price
     * (Required)
     * 
     */
    @JsonProperty("totalprice")
    public void setTotalprice(Object totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * total deposit amount
     * (Required)
     * 
     */
    @JsonProperty("deposit")
    public Object getDeposit() {
        return deposit;
    }

    /**
     * total deposit amount
     * (Required)
     * 
     */
    @JsonProperty("deposit")
    public void setDeposit(Object deposit) {
        this.deposit = deposit;
    }

    /**
     * Address
     * (Required)
     * 
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * Address
     * (Required)
     * 
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Booking.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        sb.append("checkinDatetime");
        sb.append('=');
        sb.append(((this.checkinDatetime == null)?"<null>":this.checkinDatetime));
        sb.append(',');
        sb.append("checkoutDatetime");
        sb.append('=');
        sb.append(((this.checkoutDatetime == null)?"<null>":this.checkoutDatetime));
        sb.append(',');
        sb.append("totalprice");
        sb.append('=');
        sb.append(((this.totalprice == null)?"<null>":this.totalprice));
        sb.append(',');
        sb.append("deposit");
        sb.append('=');
        sb.append(((this.deposit == null)?"<null>":this.deposit));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
