package mealdiary;

import java.nio.file.Path;
import java.util.*;

public class MealRecord implements CommonFunction{
    private String recordID;
    private Path image;
    private String foodName;
    private String drink;
    private String day;
    private String date;
    private String foodGrp;
    private String mealType;
    private static ArrayList<MealRecord> mealRecordList;
    
    public MealRecord(){
        MealRecord.mealRecordList = new ArrayList<>();
    }
    
    public MealRecord(String recordID, Path image, String foodName, String drink, String day, String date, String foodGrp, String mealType) {
        
        this.recordID = recordID;
        this.image = image;
        this.foodName = foodName;
        this.drink = drink;
        this.day = day;
        this.date = date;
        this.foodGrp = foodGrp;
        this.mealType = mealType;
    }
    
    public String getRecordID() {
        return recordID;
    }
    
    public void setRecordID(String recordID) {
        this.recordID = "MEAL" + recordID;
    }
    
    public Path getImage() {
        return image;
    }
    
    public void setImage(Path image) {
        this.image = image;
    }
    
    public String getFoodName() {
        return foodName;
    }
    
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    
    public String getDrink() {
        return drink;
    }
    
    public void setDrink(String drink) {
        this.drink = drink;
    }
    
    public String getDay() {
        return day;
    }
    
    public void setDay(String day) {
        this.day = day;
    }
    
    public String getDate() {
        return date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public String getFoodGrp() {
        return foodGrp;
    }
    
    public void setFoodGrp(String foodGrp) {
        this.foodGrp = foodGrp;
    }
    
    public String getMealType() {
        return mealType;
    }
    
    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public static ArrayList<MealRecord> getMealRecordList() {
        return mealRecordList;
    }

    public static void setMealRecordList(ArrayList<MealRecord> mealRecordList) {
        MealRecord.mealRecordList = mealRecordList;
    }

    @Override
    public void add() {
        // mealRecordList.add(new MealRecord(getRecordID(), getImage(), getFoodName(), getDrink(), getDay(), getDate(), getFoodGrp(), getMealType()));
        mealRecordList.add(new MealRecord(getRecordID(), getImage(), getFoodName(), getDrink(), getDay(), getDate(), getFoodGrp(), getMealType()));
        
    }

    @Override
    public void view() {
//        ViewFrame Fview = new ViewFrame(getMealRecordList());
//        Fview.setVisible(true);
    }

    public void edit(String updatefoodName, String updatedrink, String updateday, String updatedate, String updatefoodGrp, String updateMealType, int i) {
        
            getMealRecordList().get(i).setFoodName(updatefoodName);
            getMealRecordList().get(i).setFoodGrp(updatefoodGrp);
            getMealRecordList().get(i).setDate(updatedate);
            getMealRecordList().get(i).setDay(updateday);
            getMealRecordList().get(i).setDrink(updatedrink);
            getMealRecordList().get(i).setMealType(updateMealType);
    }

    @Override
    public void del(int i) {
        
        mealRecordList.remove(i);
    }
    
    public String dateConvert(String days, String months, String years){
        String temp = days + "-" + months + "-" + years;
        // setDate(temp);
        return temp;
    }

    @Override
    public void edit(String updatefoodName, String updatedrink, String updateday, String updatedate, String updatefoodGrp, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
