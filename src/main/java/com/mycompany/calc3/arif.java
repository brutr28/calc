package com.mycompany.calc3;


class arif
{
    private double num1;
    private double num2;
    private char typeoperation;
    
    arif()
    {
       
    }
    
    public boolean testx()
    {
        if(num2==0 && typeoperation=='x')
            return true;
        else 
            return false;
    }
    
    public boolean testkoren()
    {
        if(num1<0)
        {
            return true;
        }
        else return false;
    }
    public boolean testzero()
    {
       if(num2==0) 
       return true;
       else 
           return false;
    }
    public void get1(double num1, char typeoperation)
    {
        this.num1=num1;
        this.typeoperation=typeoperation;
    }
    
    public void get2(double num2)
    {
        this.num2=num2;
    }
    public String type(arif arifop)
    {  String num="";
        switch(arifop.typeoperation)
                {
            
            case '+':
            num=arifop.plus(arifop);
            break;
            
            case '-':
             num=arifop.minus(arifop);
             break;
            
            case '*':
            num=arifop.umnozh(arifop);
            break;
            
            case '/':
            num=arifop.del(arifop);
            break;
            
            case 'k':
                num=arifop.koren(arifop);
                break;
            
            case '^':
                num=arifop.kvadr(arifop);
                break;
            case 's':
                num=arifop.sin(arifop);
                break;
            case('c'):
                num=arifop.cos(arifop);
                break;
            case('t'):
                num=arifop.tg(arifop);
                break;
            case('g'):
                num=arifop.ctg(arifop);
                break;
            case('x'):
                num=arifop.x(arifop);
                break;
        }
        return num;
    }
    
    private String plus(arif arifop)
    {   
        double num3=arifop.num1+arifop.num2;
        String num=test(num3);
        System.out.print(num);
        return num;
    }
    
    private String minus(arif arifop)
    {
        double num3=arifop.num1-arifop.num2;
        String num=test(num3);
        return num;
    }
    
    private String umnozh(arif arifop)
    {
        double num3=arifop.num1*arifop.num2;
        String num=test(num3);
        return num;
    }
    
    private String del(arif arifop)
    {   
        double num3=arifop.num1/arifop.num2;
        String num=test(num3);
        return num;
    }
    
    private String koren(arif arifop)
    {
        double num3=Math.sqrt(num1);
        String num=test(num3);
        return num;
    }
    
    private String kvadr(arif arifop)
    {
        double num3=arifop.num1*arifop.num1;
        String num=test(num3);
        return num;
    }
    
    private String sin(arif arifop)
    {    System.out.print(num1);
        double num3=Math.sin(Math.toRadians(num1));
        System.out.print(num3);
        String num=test(num3);
        return num;
    }
    
    private String cos(arif arifop)
    {
        double num3=Math.cos(Math.toRadians(num1));
        String num=test(num3);
        return num;
    }
    
    private String tg(arif arifop)
    {
        double num3=Math.tan(Math.toRadians(num1));
        String num=test(num3);
        return num;
    }
    
    private String ctg(arif arifop)
    {
        double num3=(Math.cos(Math.toRadians(num1)))/(Math.sin(Math.toRadians(num1)));
        String num=test(num3);
        return num;
    }
    
    private String x(arif arifop)
    {
        double num3=1/num1;
        String num=test(num3);
        return num;
    }
    
    private String test(double num3)
    {   String num;
        if(num3%1==0)
        {
            int intnum=(int)num3;
            num=String.valueOf(intnum);
        }
        else
            num=String.valueOf(num3);
        return num;
    }
} 
    