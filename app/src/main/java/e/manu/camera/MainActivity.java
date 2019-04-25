package e.manu.camera;

import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.widget.Button;
import com.otaliastudios.cameraview.CameraListener;
import com.otaliastudios.cameraview.CameraView;
import com.otaliastudios.cameraview.PictureResult;
import com.otaliastudios.cameraview.VideoResult;

import java.util.concurrent.TimeUnit;

import static android.provider.MediaStore.Video.Thumbnails.HEIGHT;
import static java.awt.font.TextAttribute.WIDTH;

public class MainActivity extends AppCompatActivity {

    CameraView cameraView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//    }
//        cameraView = findViewById(R.id.camera);
//        cameraView.addCameraListener(new CameraListener() {
//            @Override
//            public void onPictureTaken(PictureResult result) {
//                // A Picture was taken!
//            }
//
//            @Override
//            public void onVideoTaken(VideoResult result) {
//                // A Video was taken!
//            }
//
//            // And much more
//        });
//        cameraView.addCameraListener(new CameraListener() {
//            @Override
//            public void onPictureTaken(PictureResult result) {
//                System.out.println("PICTURE");
//                // Picture was taken!
//                // If planning to show a Bitmap, we will take care of
//                // EXIF rotation and background threading for you...
////                result.toBitmap(maxWidth, maxHeight, callback);
//
//                // If planning to save a file on a background thread,
//                // just use toFile. Ensure you have permissions.
////                result.toFile(file, callback);
//
//                // Access the raw data if needed.
//                byte[] data = result.getData();
//            }
//        });
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                cameraView.takePicture();
//            }
//        });




    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        cameraView.open();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        cameraView.close();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        cameraView.destroy();
//    }

}
