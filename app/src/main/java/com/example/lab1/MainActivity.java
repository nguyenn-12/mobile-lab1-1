package com.example.lab1;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView profileImage;
    private TextView name, contact, skills, experience;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các thành phần UI
        profileImage = findViewById(R.id.profile_image);
        name = findViewById(R.id.tv_name);
        contact = findViewById(R.id.tv_contact);
        skills = findViewById(R.id.tv_skills);
        experience = findViewById(R.id.tv_experience);
        profileImage.setImageResource(R.drawable.tnguyen);


        // Cập nhật thông tin CV
        name.setText("Nguyễn Phan Thảo Nguyên");
        contact.setText("📧 nguyenthao@example.com | 📞 0398787710");
        skills.setText("🔹 Kỹ năng:\n- Java, Android Studio, SQL\n- Git, Firebase, REST API");
        experience.setText("🔹 Kinh nghiệm:\n- Android Developer tại ABC Corp (2023 - nay)\n- Intern tại XYZ (2022)");
    }
}
