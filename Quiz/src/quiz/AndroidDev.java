/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

/**
 *
 * @author achmadmutawazin
 */
public class AndroidDev implements Test{
    private double written,coding,interview,result;
    private String name;
    
    public AndroidDev(String name, double written, double coding, double interview){
    this.written = written;
    this.coding = coding;
    this.interview = interview;
    this.name = name;
    }

    @Override
    public void writtentest() {
        written = written*0.2;
    }

    @Override
    public void codingtest() {
        coding = coding*0.5;
    }

    @Override
    public void interviewtest() {
        interview = interview*0.3;
    }
    
    public void result(){
    result = written+coding+interview;
    if (result >= 85){
        System.out.println("Final Score : " +result);
        System.out.println("INFORMATION : SUCCESS");
        System.out.println("Congratulations to " + name + " has been accepted as Android");         
    }else {
        System.out.println("Final Score : " +result);
        System.out.println("INFORMATION : FAILED");
        System.out.println("Sorry to " + name + ", you are not accepted as Android");   
    }
    
    
    }}

