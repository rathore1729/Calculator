package rathore.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import java.lang.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.regex.Pattern;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity {
    double first,result;
    int len;

    EditText text;
    ImageButton back;
    Button but1,but2,but3,but4,but5,but6,but7,but8,but9,but0,equal,plus,sub,ac,dec,div,mult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        methodListeners();
    }
    private void init()
    {
        text = (EditText)findViewById(R.id.text);
        but1 = (Button)findViewById(R.id.but1);
        but2 = (Button)findViewById(R.id.but2);
        but3 = (Button)findViewById(R.id.but3);
        but4 = (Button)findViewById(R.id.but4);
        but5 = (Button)findViewById(R.id.but5);
        but6 = (Button)findViewById(R.id.but6);
        but7 = (Button)findViewById(R.id.but7);
        but8 = (Button)findViewById(R.id.but8);
        but9 = (Button)findViewById(R.id.but9);
        but0 = (Button)findViewById(R.id.but0);
        ac = (Button)findViewById(R.id.ac);
        dec = (Button)findViewById(R.id.dec);
        div = (Button)findViewById(R.id.div);
        mult = (Button)findViewById(R.id.mult);
        back = (ImageButton)findViewById(R.id.back);
        sub = (Button)findViewById(R.id.sub);
        plus = (Button)findViewById(R.id.plus);
        equal = (Button)findViewById(R.id.equal);
    }

    private void methodListeners()
    {
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but1();
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but2();
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but3();
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but4();
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but5();
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but6();
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but7();
            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but8();
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but9();
            }
        });
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but0();
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equal();
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plus();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back();
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mult();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                div();
            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dec();
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ac();
            }
        });

    }

    public void but1()
    {
        text.append("1");
    }

    public void but2()
    {
        text.append("2");
    }

    public void but3()
    {
        text.append("3");
    }

    public void but4()
    {
        text.append("4");
    }

    public void but5()
    {
        text.append("5");
    }

    public void but6()
    {
        text.append("6");
    }

    public void but7()
    {
        text.append("7");
    }

    public void but8()
    {
        text.append("8");
    }

    public void but9()
    {
        text.append("9");
    }

    public void but0()
    {
        text.append("0");
    }

    public void dec()
    {
        String txt = text.getText().toString();
        if(txt.equals(""))
            text.setText("0.");
        else if(txt.contains("\n")) {
            String splited[] = txt.split("\n");
            len = splited.length;
            if (Pattern.matches(".*[.].*", splited[len - 1])) {
                text.setText(txt);
                setCursor();
            } else {
                text.append(".");
            }
        }
        else if (!Pattern.matches(".*[.].*", txt))
            text.append(".");
    }


    public void ac()
    {
        text.setText("");
        first=0.0;
        result=0.0;
    }

    public void plus()
    {
        String txt = text.getText().toString();
        if(txt.equals(""))
            text.setText("");
        else if(txt.contains("\n"))
        {
            String splited[];
            splited = txt.split("\n");
            len=splited.length;
            if(Double.parseDouble(splited[len-1])==0.0)
                text.setText(txt);
            else
                text.append( "\n" + "+" + "\n" + "0");
        }
        else
            text.append( "\n" + "+" + "\n" + "0");
        setCursor();
    }

    public void sub()
    {
        String txt = text.getText().toString();
        if(txt.equals(""))
            text.setText("");
        else if(txt.contains("\n"))
        {
            String splited[];
            splited = txt.split("\n");
            len=splited.length;
            if(Double.parseDouble(splited[len-1])==0.0)
                text.setText(txt);
            else
                text.append( "\n" + "-" + "\n" + "0");
        }
        else
            text.append( "\n" + "-" + "\n" + "0");
        setCursor();
    }

    public void mult()
    {
        String txt = text.getText().toString();
        if(txt.equals(""))
            text.setText("");
        else if(txt.contains("\n"))
        {
            String splited[];
            splited = txt.split("\n");
            len=splited.length;
            if(Pattern.matches(".*[.]",splited[len-1]))
                text.setText(txt);
            else
                text.append( "\n" + "*" + "\n" + "0");
        }
        else
            text.append( "\n" + "*" + "\n" + "0");
        setCursor();
    }

    public void div()
    {
        String txt = text.getText().toString();
        if(txt.equals(""))
            text.setText("");
        else if(txt.contains("\n"))
        {
            String splited[];
            splited = txt.split("\n");
            len=splited.length;
            if(Pattern.matches(".*[.]",splited[len-1]))
                text.setText(txt);
            else
                text.append( "\n" + "/" + "\n" + "0");
        }
        else
            text.append( "\n" + "/" + "\n" + "0");
        setCursor();
    }

    public void back()
    {
        String txt = text.getText().toString();
        if(txt.equals(""))
            text.setText("");
        else
        {
            if(txt.contains("\n"))
            {
                String splited[],result="";
                splited = txt.split("\n");
                len=splited.length;
                if(splited[len-1].equals("0"))
                {
                    for(int i=0;i<len-2;i++)
                        result = result + splited[i] + "\n" ;
                    result=result.substring(0,result.length()-1);
                    text.setText(result);
                    setCursor();
                }
                else
                {
                    txt=txt.substring(0,txt.length()-1);
                    text.setText(txt);
                    setCursor();
                }
            }
            else
            {
                txt=txt.substring(0,txt.length()-1);
                text.setText(txt);
                setCursor();
            }
        }
    }

    public void equal()
    {
        String txt = text.getText().toString();
        String splited[] = txt.split("\n");
        len=splited.length;

        if (len<=2)
            text.setText(splited[0]);
        else if(Pattern.matches(".*[.]",splited[len-1]))
        {
            text.setText(txt);
            setCursor();
        }
        else
        {
            try
            {
                for(int i = 1; i<=len-2; i += 2)
                {
                    if(splited[i].equals("*")||splited[i].equals("/"))
                    {
                        if(splited[i].equals("*"))
                        {
                            splited[i+1] = "" + (Double.parseDouble(splited[i-1])*Double.parseDouble(splited[i+1]));
                            splited[i] = "+";
                            splited[i-1] = "0";
                        }
                        else
                        {
                            if(Double.parseDouble(splited[i+1])==0.0)
                            {
                                text.setText("");
                                text.setHint("Infinity\nDivided by zero !!!");
                                return;
                            }
                            else {
                                splited[i + 1] = "" + (Double.parseDouble(splited[i - 1]) / Double.parseDouble(splited[i + 1]));
                                splited[i] = "+";
                                splited[i - 1] = "0";
                            }
                        }
                    }
                }

                for(int i = 1; i<=len-2; i += 2)
                {
                    Double toBeTruncated;
                    if(splited[i].equals("+"))
                        toBeTruncated = (Double.parseDouble(splited[i - 1]) + Double.parseDouble(splited[i + 1]));
                        //splited[i+1] = "" + (Double.parseDouble(splited[i - 1]) + Double.parseDouble(splited[i + 1]));
                    else
                        toBeTruncated = (Double.parseDouble(splited[i - 1]) - Double.parseDouble(splited[i + 1]));
                        //splited[i+1] = "" + (Double.parseDouble(splited[i - 1]) - Double.parseDouble(splited[i + 1]));

                    Double truncatedDouble = BigDecimal.valueOf(toBeTruncated)
                            .setScale(3, RoundingMode.HALF_UP)
                            .doubleValue();
                    splited[i+1] = "" + truncatedDouble;
                }
                if(Pattern.matches(".*[.][0]",splited[len-1]))
                    text.setText(splited[len-1].substring(0,(splited[len-1].length()-2)));
                else
                    text.setText(splited[len-1]);
            }
            catch(Exception ex)
            {
                text.setText("");
                text.setHint("Error");
            }
        }

    }

    private void setCursor()
    {
        text.setSelection(text.getText().toString().length());
    }

}
