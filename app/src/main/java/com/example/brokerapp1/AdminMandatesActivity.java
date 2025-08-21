package com.example.brokerapp1.admin;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.brokerapp1.R;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;

public class AdminMandatesActivity extends AppCompatActivity {

    private static final int PICK_DOC_REQUEST = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_mandates);

        Button btnUpload = findViewById(R.id.btnUploadDoc);
        btnUpload.setOnClickListener(v -> openFileChooser());
    }

    private void openFileChooser() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        startActivityForResult(intent, PICK_DOC_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_DOC_REQUEST && resultCode == RESULT_OK && data != null) {
            Uri fileUri = data.getData();
            uploadDoc(fileUri);
        }
    }

    private void uploadDoc(Uri fileUri) {
        StorageReference storageRef = FirebaseStorage.getInstance().getReference()
                .child("mandates/" + System.currentTimeMillis() + ".docx");

        storageRef.putFile(fileUri)
                .addOnSuccessListener(taskSnapshot ->
                        Toast.makeText(this, "Mandate uploaded!", Toast.LENGTH_SHORT).show())
                .addOnFailureListener(e ->
                        Toast.makeText(this, "Upload failed: " + e.getMessage(), Toast.LENGTH_SHORT).show());
    }
}
