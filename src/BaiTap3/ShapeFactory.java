/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Admin
 */
public class ShapeFactory {
    public Shape createShape(ShapeType shapeType){
        Rectangle recangle = Rectangle.Instance();
        Triangle triangle = Triangle.Instance();
        Circle circle = Circle.Instance();
        
        switch(shapeType)
        {
            case recangle: return recangle;
            case triangle: return triangle;
            case circle: return circle;
        }  
        return null;
        
    }
} 
