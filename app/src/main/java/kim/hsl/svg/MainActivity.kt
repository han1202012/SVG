package kim.hsl.svg

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.DrawableCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 获取图片
        var drawable: Drawable = resources.getDrawable(R.drawable.ic_plane)
        // 设置图片为绿色
        DrawableCompat.setTint(drawable, Color.GREEN)

        // 设置绿色图片
        findViewById<ImageView>(R.id.first_image).setImageDrawable(drawable)

        // 动态获取图片资源 int
        var drawable2: Int = resources.getIdentifier(
                "ic_plane",
                "drawable",
                "kim.hsl.svg");
    }
}