package androidsamples.java.whatday;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  private EditText editDate;
  private EditText editMonth;
  private EditText editYear;
  private Button btnCheck;
  private TextView txtDisplay;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    editDate = findViewById(R.id.editDate);
    editMonth = findViewById(R.id.editMonth);
    editYear = findViewById(R.id.editYear);
    btnCheck = findViewById(R.id.btn_check);
    txtDisplay = findViewById(R.id.txt_display);

    btnCheck.setOnClickListener(v -> {
      String dateStr = editDate.getText().toString();
      String monthStr = editMonth.getText().toString();
      String yearStr = editYear.getText().toString();

      DateModel.initialize(yearStr, monthStr, dateStr);
      txtDisplay.setText(DateModel.getMessage());
    });
  }
}