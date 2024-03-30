package org.example.UserPayLoads;

import lombok.Data;

@Data
public class Add_Inventory {
    String name;
    String inventoryCode;
    String price;
    String quantity;
    String minLevel ;
    String expiryDate;
    String discount;
    String FoodName;
    String FoodCode;
    String Description;
    String image;

}
