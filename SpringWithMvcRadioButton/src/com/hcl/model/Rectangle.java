package com.hcl.model;



public class Rectangle {



 private double length;

 private double breadth;

 private String calculate;



 public Rectangle(){



 }

 public Rectangle(double length, double breadth) {

 this.length=length;

 this.breadth=breadth;

 }



 public String getCalculate() {

 return calculate;

 }

 public void setCalculate(String calculate) {

 this.calculate = calculate;

 }

 public double getLength() {

 return length;

 }

 public void setLength(double length) {

 this.length = length;

 }

 public double getBreadth() {

 return breadth;

 }

 public void setBreadth(double breadth) {

 this.breadth = breadth;

 }



 public double calculateArea(){

 return length*breadth;

 }



 public double calculatePerimeter(){

 return 2 *(length + breadth);

 }



}