import android.widget.EditText

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var nameEditText: EditText
    private lateinit var lastnameEditText: EditText
    private lateinit var gpaEditText: EditText


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nameEditText = view.findViewById(R.id.nameEditText)
        lastNameEditText = view.findViewById(R.id.lastNameEditText)
        gpaEditText = view.findViewById(R.id.gpaEditText)

        view.findViewById<Button>(R.id.button1).setOnClickListener { moveToProfileFragment() }

        view.findViewById<Button>(R.id.button1).setOnLongClickListener {
            clearEditTextFields()
            true
        }

        view.findViewById<Button>(R.id.button2).setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_listFragment)
        }
    }

    private fun moveToProfileFragment() {

        val name = nameEditText.text.toString()
        val lastName = lastnameEditText.text.toString()
        val gpa = gpaEditText.text.toString()
        val action = HomeFragmentDirections.actionHomeFragmentToProfileFragment(name, lastName, gpa)
        findNavController().navigate(action)
    }

    private fun clearEditTextFields() {

        nameEditText.text.clear()
        lastnameEditText.text.clear()
        gpaEditText.text.clear()
    }


}