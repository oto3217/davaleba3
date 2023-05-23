import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class ListFragment : Fragment(R.layout.fragment_list) {

    private lateinit var imageView1: ImageView
    private lateinit var imageView2: ImageView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imageView1 = view.findViewById(R.id.imageView1)
        imageView2 = view.findViewById(R.id.imageView2)

        imageView1.setOnClickListener {
            // Handle click on imageView1
            // Return to the HomeFragment or perform any desired action
        }

        imageView2.setOnClickListener {
            // Handle click on imageView2
            // Open the ProfileFragment or perform any desired action
        }
    }
}
