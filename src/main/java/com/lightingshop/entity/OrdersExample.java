package com.lightingshop.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderIDIsNull() {
            addCriterion("orderID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIDIsNotNull() {
            addCriterion("orderID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIDEqualTo(String value) {
            addCriterion("o.orderID =", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDNotEqualTo(String value) {
            addCriterion("orderID <>", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDGreaterThan(String value) {
            addCriterion("orderID >", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDGreaterThanOrEqualTo(String value) {
            addCriterion("orderID >=", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDLessThan(String value) {
            addCriterion("orderID <", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDLessThanOrEqualTo(String value) {
            addCriterion("orderID <=", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDLike(String value) {
            addCriterion("orderID like", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDNotLike(String value) {
            addCriterion("orderID not like", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDIn(List<String> values) {
            addCriterion("orderID in", values, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDNotIn(List<String> values) {
            addCriterion("orderID not in", values, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDBetween(String value1, String value2) {
            addCriterion("orderID between", value1, value2, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDNotBetween(String value1, String value2) {
            addCriterion("orderID not between", value1, value2, "orderID");
            return (Criteria) this;
        }

        public Criteria andUserIDIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUserIDIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIDEqualTo(Integer value) {
            addCriterion("userID =", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThan(Integer value) {
            addCriterion("userID >", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThan(Integer value) {
            addCriterion("userID <", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDIn(List<Integer> values) {
            addCriterion("userID in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNull() {
            addCriterion("totalPrice is null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNotNull() {
            addCriterion("totalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceEqualTo(BigDecimal value) {
            addCriterion("totalPrice =", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotEqualTo(BigDecimal value) {
            addCriterion("totalPrice <>", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThan(BigDecimal value) {
            addCriterion("totalPrice >", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalPrice >=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThan(BigDecimal value) {
            addCriterion("totalPrice <", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalPrice <=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIn(List<BigDecimal> values) {
            addCriterion("totalPrice in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotIn(List<BigDecimal> values) {
            addCriterion("totalPrice not in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalPrice between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalPrice not between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andOrderstateidIsNull() {
            addCriterion("orderStateID is null");
            return (Criteria) this;
        }

        public Criteria andOrderstateidIsNotNull() {
            addCriterion("orderStateID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstateidEqualTo(Integer value) {
            addCriterion("orderStateID =", value, "orderstateid");
            return (Criteria) this;
        }

        public Criteria andOrderstateidNotEqualTo(Integer value) {
            addCriterion("orderStateID <>", value, "orderstateid");
            return (Criteria) this;
        }

        public Criteria andOrderstateidGreaterThan(Integer value) {
            addCriterion("orderStateID >", value, "orderstateid");
            return (Criteria) this;
        }

        public Criteria andOrderstateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderStateID >=", value, "orderstateid");
            return (Criteria) this;
        }

        public Criteria andOrderstateidLessThan(Integer value) {
            addCriterion("orderStateID <", value, "orderstateid");
            return (Criteria) this;
        }

        public Criteria andOrderstateidLessThanOrEqualTo(Integer value) {
            addCriterion("orderStateID <=", value, "orderstateid");
            return (Criteria) this;
        }

        public Criteria andOrderstateidIn(List<Integer> values) {
            addCriterion("orderStateID in", values, "orderstateid");
            return (Criteria) this;
        }

        public Criteria andOrderstateidNotIn(List<Integer> values) {
            addCriterion("orderStateID not in", values, "orderstateid");
            return (Criteria) this;
        }

        public Criteria andOrderstateidBetween(Integer value1, Integer value2) {
            addCriterion("orderStateID between", value1, value2, "orderstateid");
            return (Criteria) this;
        }

        public Criteria andOrderstateidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderStateID not between", value1, value2, "orderstateid");
            return (Criteria) this;
        }

        public Criteria andShowornotIsNull() {
            addCriterion("showOrNot is null");
            return (Criteria) this;
        }

        public Criteria andShowornotIsNotNull() {
            addCriterion("showOrNot is not null");
            return (Criteria) this;
        }

        public Criteria andShowornotEqualTo(Integer value) {
            addCriterion("showOrNot =", value, "showornot");
            return (Criteria) this;
        }

        public Criteria andShowornotNotEqualTo(Integer value) {
            addCriterion("showOrNot <>", value, "showornot");
            return (Criteria) this;
        }

        public Criteria andShowornotGreaterThan(Integer value) {
            addCriterion("showOrNot >", value, "showornot");
            return (Criteria) this;
        }

        public Criteria andShowornotGreaterThanOrEqualTo(Integer value) {
            addCriterion("showOrNot >=", value, "showornot");
            return (Criteria) this;
        }

        public Criteria andShowornotLessThan(Integer value) {
            addCriterion("showOrNot <", value, "showornot");
            return (Criteria) this;
        }

        public Criteria andShowornotLessThanOrEqualTo(Integer value) {
            addCriterion("showOrNot <=", value, "showornot");
            return (Criteria) this;
        }

        public Criteria andShowornotIn(List<Integer> values) {
            addCriterion("showOrNot in", values, "showornot");
            return (Criteria) this;
        }

        public Criteria andShowornotNotIn(List<Integer> values) {
            addCriterion("showOrNot not in", values, "showornot");
            return (Criteria) this;
        }

        public Criteria andShowornotBetween(Integer value1, Integer value2) {
            addCriterion("showOrNot between", value1, value2, "showornot");
            return (Criteria) this;
        }

        public Criteria andShowornotNotBetween(Integer value1, Integer value2) {
            addCriterion("showOrNot not between", value1, value2, "showornot");
            return (Criteria) this;
        }

        public Criteria andReceivenameIsNull() {
            addCriterion("receiveName is null");
            return (Criteria) this;
        }

        public Criteria andReceivenameIsNotNull() {
            addCriterion("receiveName is not null");
            return (Criteria) this;
        }

        public Criteria andReceivenameEqualTo(String value) {
            addCriterion("receiveName =", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameNotEqualTo(String value) {
            addCriterion("receiveName <>", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameGreaterThan(String value) {
            addCriterion("receiveName >", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameGreaterThanOrEqualTo(String value) {
            addCriterion("receiveName >=", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameLessThan(String value) {
            addCriterion("receiveName <", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameLessThanOrEqualTo(String value) {
            addCriterion("receiveName <=", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameLike(String value) {
            addCriterion("receiveName like", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameNotLike(String value) {
            addCriterion("receiveName not like", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameIn(List<String> values) {
            addCriterion("receiveName in", values, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameNotIn(List<String> values) {
            addCriterion("receiveName not in", values, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameBetween(String value1, String value2) {
            addCriterion("receiveName between", value1, value2, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameNotBetween(String value1, String value2) {
            addCriterion("receiveName not between", value1, value2, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivephoneIsNull() {
            addCriterion("receivePhone is null");
            return (Criteria) this;
        }

        public Criteria andReceivephoneIsNotNull() {
            addCriterion("receivePhone is not null");
            return (Criteria) this;
        }

        public Criteria andReceivephoneEqualTo(String value) {
            addCriterion("receivePhone =", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneNotEqualTo(String value) {
            addCriterion("receivePhone <>", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneGreaterThan(String value) {
            addCriterion("receivePhone >", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneGreaterThanOrEqualTo(String value) {
            addCriterion("receivePhone >=", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneLessThan(String value) {
            addCriterion("receivePhone <", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneLessThanOrEqualTo(String value) {
            addCriterion("receivePhone <=", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneLike(String value) {
            addCriterion("receivePhone like", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneNotLike(String value) {
            addCriterion("receivePhone not like", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneIn(List<String> values) {
            addCriterion("receivePhone in", values, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneNotIn(List<String> values) {
            addCriterion("receivePhone not in", values, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneBetween(String value1, String value2) {
            addCriterion("receivePhone between", value1, value2, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneNotBetween(String value1, String value2) {
            addCriterion("receivePhone not between", value1, value2, "receivephone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNull() {
            addCriterion("postalCode is null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNotNull() {
            addCriterion("postalCode is not null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeEqualTo(String value) {
            addCriterion("postalCode =", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotEqualTo(String value) {
            addCriterion("postalCode <>", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThan(String value) {
            addCriterion("postalCode >", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postalCode >=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThan(String value) {
            addCriterion("postalCode <", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThanOrEqualTo(String value) {
            addCriterion("postalCode <=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLike(String value) {
            addCriterion("postalCode like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotLike(String value) {
            addCriterion("postalCode not like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIn(List<String> values) {
            addCriterion("postalCode in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotIn(List<String> values) {
            addCriterion("postalCode not in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeBetween(String value1, String value2) {
            addCriterion("postalCode between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotBetween(String value1, String value2) {
            addCriterion("postalCode not between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPosttypeIsNull() {
            addCriterion("postType is null");
            return (Criteria) this;
        }

        public Criteria andPosttypeIsNotNull() {
            addCriterion("postType is not null");
            return (Criteria) this;
        }

        public Criteria andPosttypeEqualTo(String value) {
            addCriterion("postType =", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeNotEqualTo(String value) {
            addCriterion("postType <>", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeGreaterThan(String value) {
            addCriterion("postType >", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeGreaterThanOrEqualTo(String value) {
            addCriterion("postType >=", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeLessThan(String value) {
            addCriterion("postType <", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeLessThanOrEqualTo(String value) {
            addCriterion("postType <=", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeLike(String value) {
            addCriterion("postType like", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeNotLike(String value) {
            addCriterion("postType not like", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeIn(List<String> values) {
            addCriterion("postType in", values, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeNotIn(List<String> values) {
            addCriterion("postType not in", values, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeBetween(String value1, String value2) {
            addCriterion("postType between", value1, value2, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeNotBetween(String value1, String value2) {
            addCriterion("postType not between", value1, value2, "posttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIsNull() {
            addCriterion("paymentType is null");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIsNotNull() {
            addCriterion("paymentType is not null");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeEqualTo(String value) {
            addCriterion("paymentType =", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotEqualTo(String value) {
            addCriterion("paymentType <>", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeGreaterThan(String value) {
            addCriterion("paymentType >", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("paymentType >=", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLessThan(String value) {
            addCriterion("paymentType <", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLessThanOrEqualTo(String value) {
            addCriterion("paymentType <=", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLike(String value) {
            addCriterion("paymentType like", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotLike(String value) {
            addCriterion("paymentType not like", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIn(List<String> values) {
            addCriterion("paymentType in", values, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotIn(List<String> values) {
            addCriterion("paymentType not in", values, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeBetween(String value1, String value2) {
            addCriterion("paymentType between", value1, value2, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotBetween(String value1, String value2) {
            addCriterion("paymentType not between", value1, value2, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPostfeeIsNull() {
            addCriterion("postFee is null");
            return (Criteria) this;
        }

        public Criteria andPostfeeIsNotNull() {
            addCriterion("postFee is not null");
            return (Criteria) this;
        }

        public Criteria andPostfeeEqualTo(BigDecimal value) {
            addCriterion("postFee =", value, "postfee");
            return (Criteria) this;
        }

        public Criteria andPostfeeNotEqualTo(BigDecimal value) {
            addCriterion("postFee <>", value, "postfee");
            return (Criteria) this;
        }

        public Criteria andPostfeeGreaterThan(BigDecimal value) {
            addCriterion("postFee >", value, "postfee");
            return (Criteria) this;
        }

        public Criteria andPostfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("postFee >=", value, "postfee");
            return (Criteria) this;
        }

        public Criteria andPostfeeLessThan(BigDecimal value) {
            addCriterion("postFee <", value, "postfee");
            return (Criteria) this;
        }

        public Criteria andPostfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("postFee <=", value, "postfee");
            return (Criteria) this;
        }

        public Criteria andPostfeeIn(List<BigDecimal> values) {
            addCriterion("postFee in", values, "postfee");
            return (Criteria) this;
        }

        public Criteria andPostfeeNotIn(List<BigDecimal> values) {
            addCriterion("postFee not in", values, "postfee");
            return (Criteria) this;
        }

        public Criteria andPostfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("postFee between", value1, value2, "postfee");
            return (Criteria) this;
        }

        public Criteria andPostfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("postFee not between", value1, value2, "postfee");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}