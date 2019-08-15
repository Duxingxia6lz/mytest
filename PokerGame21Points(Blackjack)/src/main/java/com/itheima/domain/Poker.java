package com.itheima.domain;


/**
 * 扑克牌的对象实体类
 */
public class Poker {

    private int id;
    private String name;
    private int value;

    public Poker() {
    }

    public Poker(int id, String name, int value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public Poker( String name, int value) {
        this.name = name;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "poker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }


}
