package com.lightingshop.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LightExample() {
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

        public Criteria andlightIDIsNull() {
            addCriterion("lightID is null");
            return (Criteria) this;
        }

        public Criteria andlightIDIsNotNull() {
            addCriterion("lightID is not null");
            return (Criteria) this;
        }

        public Criteria andlightIDEqualTo(Integer value) {
            addCriterion("lightID =", value, "lightID");
            return (Criteria) this;
        }

        public Criteria andlightIDNotEqualTo(Integer value) {
            addCriterion("lightID <>", value, "lightID");
            return (Criteria) this;
        }

        public Criteria andlightIDGreaterThan(Integer value) {
            addCriterion("lightID >", value, "lightID");
            return (Criteria) this;
        }

        public Criteria andlightIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("lightID >=", value, "lightID");
            return (Criteria) this;
        }

        public Criteria andlightIDLessThan(Integer value) {
            addCriterion("lightID <", value, "lightID");
            return (Criteria) this;
        }

        public Criteria andlightIDLessThanOrEqualTo(Integer value) {
            addCriterion("lightID <=", value, "lightID");
            return (Criteria) this;
        }

        public Criteria andlightIDIn(List<Integer> values) {
            addCriterion("lightID in", values, "lightID");
            return (Criteria) this;
        }

        public Criteria andlightIDNotIn(List<Integer> values) {
            addCriterion("lightID not in", values, "lightID");
            return (Criteria) this;
        }

        public Criteria andlightIDBetween(Integer value1, Integer value2) {
            addCriterion("lightID between", value1, value2, "lightID");
            return (Criteria) this;
        }

        public Criteria andlightIDNotBetween(Integer value1, Integer value2) {
            addCriterion("lightID not between", value1, value2, "lightID");
            return (Criteria) this;
        }

        public Criteria andlightNameIsNull() {
            addCriterion("lightName is null");
            return (Criteria) this;
        }

        public Criteria andlightNameIsNotNull() {
            addCriterion("lightName is not null");
            return (Criteria) this;
        }

        public Criteria andlightNameEqualTo(String value) {
            addCriterion("lightName =", value, "lightName");
            return (Criteria) this;
        }

        public Criteria andlightNameNotEqualTo(String value) {
            addCriterion("lightName <>", value, "lightName");
            return (Criteria) this;
        }

        public Criteria andlightNameGreaterThan(String value) {
            addCriterion("lightName >", value, "lightName");
            return (Criteria) this;
        }

        public Criteria andlightNameGreaterThanOrEqualTo(String value) {
            addCriterion("lightName >=", value, "lightName");
            return (Criteria) this;
        }

        public Criteria andlightNameLessThan(String value) {
            addCriterion("lightName <", value, "lightName");
            return (Criteria) this;
        }

        public Criteria andlightNameLessThanOrEqualTo(String value) {
            addCriterion("lightName <=", value, "lightName");
            return (Criteria) this;
        }

        public Criteria andlightNameLike(String value) {
            addCriterion("lightName like", value, "lightName");
            return (Criteria) this;
        }

        public Criteria andlightNameNotLike(String value) {
            addCriterion("lightName not like", value, "lightName");
            return (Criteria) this;
        }

        public Criteria andlightNameIn(List<String> values) {
            addCriterion("lightName in", values, "lightName");
            return (Criteria) this;
        }

        public Criteria andlightNameNotIn(List<String> values) {
            addCriterion("lightName not in", values, "lightName");
            return (Criteria) this;
        }

        public Criteria andlightNameBetween(String value1, String value2) {
            addCriterion("lightName between", value1, value2, "lightName");
            return (Criteria) this;
        }

        public Criteria andlightNameNotBetween(String value1, String value2) {
            addCriterion("lightName not between", value1, value2, "lightName");
            return (Criteria) this;
        }

        public Criteria andcategoryIDIsNull() {
            addCriterion("categoryID is null");
            return (Criteria) this;
        }

        public Criteria andcategoryIDIsNotNull() {
            addCriterion("categoryID is not null");
            return (Criteria) this;
        }

        public Criteria andcategoryIDEqualTo(Integer value) {
            addCriterion("categoryID =", value, "categoryID");
            return (Criteria) this;
        }

        public Criteria andcategoryIDNotEqualTo(Integer value) {
            addCriterion("categoryID <>", value, "categoryID");
            return (Criteria) this;
        }

        public Criteria andcategoryIDGreaterThan(Integer value) {
            addCriterion("categoryID >", value, "categoryID");
            return (Criteria) this;
        }

        public Criteria andcategoryIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("categoryID >=", value, "categoryID");
            return (Criteria) this;
        }

        public Criteria andcategoryIDLessThan(Integer value) {
            addCriterion("categoryID <", value, "categoryID");
            return (Criteria) this;
        }

        public Criteria andcategoryIDLessThanOrEqualTo(Integer value) {
            addCriterion("categoryID <=", value, "categoryID");
            return (Criteria) this;
        }

        public Criteria andcategoryIDIn(List<Integer> values) {
            addCriterion("categoryID in", values, "categoryID");
            return (Criteria) this;
        }

        public Criteria andcategoryIDNotIn(List<Integer> values) {
            addCriterion("categoryID not in", values, "categoryID");
            return (Criteria) this;
        }

        public Criteria andcategoryIDBetween(Integer value1, Integer value2) {
            addCriterion("categoryID between", value1, value2, "categoryID");
            return (Criteria) this;
        }

        public Criteria andcategoryIDNotBetween(Integer value1, Integer value2) {
            addCriterion("categoryID not between", value1, value2, "categoryID");
            return (Criteria) this;
        }

        public Criteria andbrandIDIsNull() {
            addCriterion("brandID is null");
            return (Criteria) this;
        }

        public Criteria andbrandIDIsNotNull() {
            addCriterion("brandID is not null");
            return (Criteria) this;
        }

        public Criteria andbrandIDEqualTo(Integer value) {
            addCriterion("brandID =", value, "brandID");
            return (Criteria) this;
        }

        public Criteria andbrandIDNotEqualTo(Integer value) {
            addCriterion("brandID <>", value, "brandID");
            return (Criteria) this;
        }

        public Criteria andbrandIDGreaterThan(Integer value) {
            addCriterion("brandID >", value, "brandID");
            return (Criteria) this;
        }

        public Criteria andbrandIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("brandID >=", value, "brandID");
            return (Criteria) this;
        }

        public Criteria andbrandIDLessThan(Integer value) {
            addCriterion("brandID <", value, "brandID");
            return (Criteria) this;
        }

        public Criteria andbrandIDLessThanOrEqualTo(Integer value) {
            addCriterion("brandID <=", value, "brandID");
            return (Criteria) this;
        }

        public Criteria andbrandIDIn(List<Integer> values) {
            addCriterion("brandID in", values, "brandID");
            return (Criteria) this;
        }

        public Criteria andbrandIDNotIn(List<Integer> values) {
            addCriterion("brandID not in", values, "brandID");
            return (Criteria) this;
        }

        public Criteria andbrandIDBetween(Integer value1, Integer value2) {
            addCriterion("brandID between", value1, value2, "brandID");
            return (Criteria) this;
        }

        public Criteria andbrandIDNotBetween(Integer value1, Integer value2) {
            addCriterion("brandID not between", value1, value2, "brandID");
            return (Criteria) this;
        }

        public Criteria andstyleIDIsNull() {
            addCriterion("styleID is null");
            return (Criteria) this;
        }

        public Criteria andstyleIDIsNotNull() {
            addCriterion("styleID is not null");
            return (Criteria) this;
        }

        public Criteria andstyleIDEqualTo(Integer value) {
            addCriterion("styleID =", value, "styleID");
            return (Criteria) this;
        }

        public Criteria andstyleIDNotEqualTo(Integer value) {
            addCriterion("styleID <>", value, "styleID");
            return (Criteria) this;
        }

        public Criteria andstyleIDGreaterThan(Integer value) {
            addCriterion("styleID >", value, "styleID");
            return (Criteria) this;
        }

        public Criteria andstyleIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("styleID >=", value, "styleID");
            return (Criteria) this;
        }

        public Criteria andstyleIDLessThan(Integer value) {
            addCriterion("styleID <", value, "styleID");
            return (Criteria) this;
        }

        public Criteria andstyleIDLessThanOrEqualTo(Integer value) {
            addCriterion("styleID <=", value, "styleID");
            return (Criteria) this;
        }

        public Criteria andstyleIDIn(List<Integer> values) {
            addCriterion("styleID in", values, "styleID");
            return (Criteria) this;
        }

        public Criteria andstyleIDNotIn(List<Integer> values) {
            addCriterion("styleID not in", values, "styleID");
            return (Criteria) this;
        }

        public Criteria andstyleIDBetween(Integer value1, Integer value2) {
            addCriterion("styleID between", value1, value2, "styleID");
            return (Criteria) this;
        }

        public Criteria andstyleIDNotBetween(Integer value1, Integer value2) {
            addCriterion("styleID not between", value1, value2, "styleID");
            return (Criteria) this;
        }

        public Criteria andStuffIsNull() {
            addCriterion("stuff is null");
            return (Criteria) this;
        }

        public Criteria andStuffIsNotNull() {
            addCriterion("stuff is not null");
            return (Criteria) this;
        }

        public Criteria andStuffEqualTo(String value) {
            addCriterion("stuff =", value, "stuff");
            return (Criteria) this;
        }

        public Criteria andStuffNotEqualTo(String value) {
            addCriterion("stuff <>", value, "stuff");
            return (Criteria) this;
        }

        public Criteria andStuffGreaterThan(String value) {
            addCriterion("stuff >", value, "stuff");
            return (Criteria) this;
        }

        public Criteria andStuffGreaterThanOrEqualTo(String value) {
            addCriterion("stuff >=", value, "stuff");
            return (Criteria) this;
        }

        public Criteria andStuffLessThan(String value) {
            addCriterion("stuff <", value, "stuff");
            return (Criteria) this;
        }

        public Criteria andStuffLessThanOrEqualTo(String value) {
            addCriterion("stuff <=", value, "stuff");
            return (Criteria) this;
        }

        public Criteria andStuffLike(String value) {
            addCriterion("stuff like", value, "stuff");
            return (Criteria) this;
        }

        public Criteria andStuffNotLike(String value) {
            addCriterion("stuff not like", value, "stuff");
            return (Criteria) this;
        }

        public Criteria andStuffIn(List<String> values) {
            addCriterion("stuff in", values, "stuff");
            return (Criteria) this;
        }

        public Criteria andStuffNotIn(List<String> values) {
            addCriterion("stuff not in", values, "stuff");
            return (Criteria) this;
        }

        public Criteria andStuffBetween(String value1, String value2) {
            addCriterion("stuff between", value1, value2, "stuff");
            return (Criteria) this;
        }

        public Criteria andStuffNotBetween(String value1, String value2) {
            addCriterion("stuff not between", value1, value2, "stuff");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andLocateIsNull() {
            addCriterion("locate is null");
            return (Criteria) this;
        }

        public Criteria andLocateIsNotNull() {
            addCriterion("locate is not null");
            return (Criteria) this;
        }

        public Criteria andLocateEqualTo(String value) {
            addCriterion("locate =", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateNotEqualTo(String value) {
            addCriterion("locate <>", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateGreaterThan(String value) {
            addCriterion("locate >", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateGreaterThanOrEqualTo(String value) {
            addCriterion("locate >=", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateLessThan(String value) {
            addCriterion("locate <", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateLessThanOrEqualTo(String value) {
            addCriterion("locate <=", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateLike(String value) {
            addCriterion("locate like", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateNotLike(String value) {
            addCriterion("locate not like", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateIn(List<String> values) {
            addCriterion("locate in", values, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateNotIn(List<String> values) {
            addCriterion("locate not in", values, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateBetween(String value1, String value2) {
            addCriterion("locate between", value1, value2, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateNotBetween(String value1, String value2) {
            addCriterion("locate not between", value1, value2, "locate");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andImagesIsNull() {
            addCriterion("images is null");
            return (Criteria) this;
        }

        public Criteria andImagesIsNotNull() {
            addCriterion("images is not null");
            return (Criteria) this;
        }

        public Criteria andImagesEqualTo(String value) {
            addCriterion("images =", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotEqualTo(String value) {
            addCriterion("images <>", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThan(String value) {
            addCriterion("images >", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThanOrEqualTo(String value) {
            addCriterion("images >=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThan(String value) {
            addCriterion("images <", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThanOrEqualTo(String value) {
            addCriterion("images <=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLike(String value) {
            addCriterion("images like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotLike(String value) {
            addCriterion("images not like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesIn(List<String> values) {
            addCriterion("images in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotIn(List<String> values) {
            addCriterion("images not in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesBetween(String value1, String value2) {
            addCriterion("images between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotBetween(String value1, String value2) {
            addCriterion("images not between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andSalesIsNull() {
            addCriterion("sales is null");
            return (Criteria) this;
        }

        public Criteria andSalesIsNotNull() {
            addCriterion("sales is not null");
            return (Criteria) this;
        }

        public Criteria andSalesEqualTo(Integer value) {
            addCriterion("sales =", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotEqualTo(Integer value) {
            addCriterion("sales <>", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThan(Integer value) {
            addCriterion("sales >", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales >=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThan(Integer value) {
            addCriterion("sales <", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThanOrEqualTo(Integer value) {
            addCriterion("sales <=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesIn(List<Integer> values) {
            addCriterion("sales in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotIn(List<Integer> values) {
            addCriterion("sales not in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesBetween(Integer value1, Integer value2) {
            addCriterion("sales between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("sales not between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
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