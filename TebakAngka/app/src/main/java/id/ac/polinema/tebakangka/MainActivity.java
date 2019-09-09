package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	private EditText number_input;
	int random = 0;
	private Button guess, reset;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		initRandomNumber();
		number_input = findViewById(R.id.number_input);
		guess = findViewById(R.id.guess_button);
		reset = findViewById(R.id.reset_button);
	}

	// TODO: generate angka random di sini
	private int initRandomNumber() {
	random = (int) (Math.random()*100);
	return random;
	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		int number = Integer.parseInt(String.valueOf(number_input.getText()));
		if (number > random) {
			Toast.makeText(this,"Tebakan anda terlalu Besar!", Toast.LENGTH_SHORT).show();
		}else if (number < random) {
			Toast.makeText(this,"Tebakan anda terlalu Kecil!", Toast.LENGTH_SHORT).show();
		}else {
			Toast.makeText(this,"Tebakan anda Benar !", Toast.LENGTH_SHORT).show();
		}
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
		number_input.setText("");
		initRandomNumber();

	}
}