package stupid.inc.nothing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;

    String ans = "";
    Boolean isValid = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        editText = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans = editText.getText().toString();

                if(ans.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please Enter an Answer", Toast.LENGTH_LONG).show();
                }
                else
                {
                    isValid = validate(ans);
                    if(isValid)
                    {
                        openActivity2();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Your Answer is Wrong", Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
    }

    private boolean validate(String ans)
    {
        if(ans.equals("wskghsobnouabyhaenbuaiwrhgiuwy9748673487kjsdbvawsygvb"))
        {
            return true;
        }
        return false;
    }

    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}