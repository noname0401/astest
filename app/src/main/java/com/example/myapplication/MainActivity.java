package com.example.myapplication;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    private ImageView captchaImage;
    private EditText captchaText,editTextUsername,editTextPassword,editTextNewUsername, editTextNewPassword;
    private Button checkButton,buttonChangeUsername, buttonChangePassword;
    private String generatedCaptcha;
    private String Username,Passwaord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        captchaImage = findViewById(R.id.image_captcha);
        captchaText = findViewById(R.id.edit_captcha);
        checkButton = findViewById(R.id.button_check);
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonChangeUsername = findViewById(R.id.buttonChangeUsername);
        buttonChangePassword = findViewById(R.id.buttonChangePassword);

        Username="WYH";
        Passwaord="2102020224";
        // 生成验证码
        generatedCaptcha = generateCaptcha();
        Bitmap captchaBitmap = generateCaptchaBitmap(generatedCaptcha);
        captchaImage.setImageBitmap(captchaBitmap);
        //登录
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
        //更新验证码
        captchaImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generatedCaptcha = generateCaptcha();
                Bitmap captchaBitmap = generateCaptchaBitmap(generatedCaptcha);
                captchaImage.setImageBitmap(captchaBitmap);
                captchaText.setText("");
            }
        });
        buttonChangeUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showChangeUsernameDialog();
            }
        });
        buttonChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showChangePasswordDialog();
            }
        });

    }

    private void showChangeUsernameDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("修改用户名");
        View view = getLayoutInflater().inflate(R.layout.activity_change_username, null);
        editTextNewUsername = view.findViewById(R.id.NewUsername);
        builder.setView(view);
        builder.setPositiveButton("确认", (dialog, which) -> {
            Username = editTextNewUsername.getText().toString().trim();
            Toast.makeText(MainActivity.this, "新的用户名：" + Username, Toast.LENGTH_SHORT).show();
        });
        builder.setNegativeButton("取消", null);
        builder.show();
    }
    private void showChangePasswordDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("修改密码");
        View view = getLayoutInflater().inflate(R.layout.activity_change_password, null);
        editTextNewPassword = view.findViewById(R.id.editTextNewPassword);
        builder.setView(view);
        builder.setPositiveButton("确认", (dialog, which) -> {
            Passwaord = editTextNewPassword.getText().toString().trim();
            Toast.makeText(MainActivity.this, "新的密码：" + Passwaord, Toast.LENGTH_SHORT).show();
        });
        builder.setNegativeButton("取消", null);
        builder.show();
    }
    private void login() {
        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();
        String inputCaptcha = captchaText.getText().toString().trim();

        if (username.equals(Username) && password.equals(Passwaord) && inputCaptcha.equalsIgnoreCase(generatedCaptcha)) {
            Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
        } else {
            String errorMessage = "";
            if (!username.equals(Username)) {
                Toast.makeText(MainActivity.this, "用户名错误", Toast.LENGTH_SHORT).show();
            }
            if (!password.equals(Passwaord)) {
                Toast.makeText(MainActivity.this, "密码错误", Toast.LENGTH_SHORT).show();
            }
            if (!inputCaptcha.equalsIgnoreCase(generatedCaptcha)) {
                Toast.makeText(MainActivity.this, "验证码错误", Toast.LENGTH_SHORT).show();
            }
        }
    }
    private String generateCaptcha() {
        Random random = new Random();
        StringBuilder captchaBuilder = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            char c = (char) (random.nextInt(26) + 'A');
            captchaBuilder.append(c);
        }

        return captchaBuilder.toString();
    }

    private Bitmap generateCaptchaBitmap(String captcha) {
        int width = 200;
        int height = 80;

        Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);

        Paint backgroundPaint = new Paint();
        backgroundPaint.setColor(Color.WHITE);
        canvas.drawRect(0, 0, width, height, backgroundPaint);

        Paint linePaint = new Paint();
        linePaint.setColor(Color.GRAY);
        linePaint.setStrokeWidth(2f);

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int startX = random.nextInt(width);
            int startY = random.nextInt(height);
            int endX = random.nextInt(width);
            int endY = random.nextInt(height);
            canvas.drawLine(startX, startY, endX, endY, linePaint);
        }

        Paint textPaint = new Paint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(48f);

        Random angleRandom = new Random();
        for (int i = 0; i < captcha.length(); i++) {
            char c = captcha.charAt(i);
            float x = (width / captcha.length()) * i + 20f;
            float y = height / 2 - (textPaint.ascent() + textPaint.descent()) / 2;

            float angle = angleRandom.nextInt(40) - 15;   // 可以根据需要修改角度范围

            int color = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            textPaint.setColor(color);
            canvas.rotate(angle, x, y);
            canvas.drawText(String.valueOf(c), x, y, textPaint);
            canvas.rotate(-angle, x, y);
        }

        return bitmap;
    }

}