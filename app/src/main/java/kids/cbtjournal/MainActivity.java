package kids.cbtjournal;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openWriteEntry(View view){
        Intent writeEntryIntent = new Intent(this, WriteEntryActivity.class);
        startActivity(writeEntryIntent);
    }

    public void open12Unhealthy(View view){
        Intent open12Intent = new Intent(this, UnhealthyThinking.class);
        startActivity(open12Intent);
    }
}
