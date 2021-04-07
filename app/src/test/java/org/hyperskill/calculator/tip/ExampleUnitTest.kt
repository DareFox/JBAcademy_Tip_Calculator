package org.hyperskill.calculator.tip
//
//import android.app.Activity
//import android.view.inputmethod.EditorInfo
//import android.widget.EditText
//import android.widget.TextView
//import com.google.android.material.slider.Slider
//import io.darefox.jbacademy.tip_calucaltor.MainActivity
//import io.darefox.jbacademy.tip_calucaltor.R
//import org.junit.Assert.*
//import org.junit.Test
//import org.junit.runner.RunWith
//import org.robolectric.Robolectric
//import org.robolectric.RobolectricTestRunner
//
//@RunWith(RobolectricTestRunner::class)
//class ExampleUnitTest {
//
//    private val activityController = Robolectric.buildActivity<MainActivity>(MainActivity::class.java)
//
//    @Test
//    fun testShouldCheckEditTextExist() {
//        val activity = activityController.setup().get()
//        val editText = activity.findViewById<EditText>(R.id.edit_text)
//
//        val message = "does view with id \"edit_text\" placed in activity?"
//        assertNotNull(message, editText)
//
//        val message2 = "edit_text should have proper inputType attribute"
//        assertEquals(message2, editText.inputType, EditorInfo.TYPE_NUMBER_FLAG_DECIMAL + EditorInfo.TYPE_CLASS_NUMBER)
//    }
//
//    @Test
//    fun testShouldCheckSliderExist() {
//        val activity = activityController.setup().get()
//        val slider = activity.findViewById<Slider>(R.id.slider)
//
//        val message = "does view with id \"slider\" placed in activity?"
//        assertNotNull(message, slider)
//
//        val message2 = "\"slider\" should have proper stepSize attribute"
//        assertEquals(message2, slider.stepSize, 1.0f)
//
//        val message3 = "\"slider\" should have proper valueFrom attribute"
//        assertEquals(message3, slider.valueFrom, 0.0f)
//
//        val message4 = "\"slider\" should have proper valueTo attribute"
//        assertEquals(message4, slider.valueTo, 100.0f)
//
//        val message5 = "\"slider\" should have proper initial value"
//        assertEquals(message5, 0f, slider.value)
//    }
//
//    @Test
//    fun testShouldCheckTextViewExist() {
//        val activity = activityController.setup().get()
//
//        val message = "does view with id \"text_view\" placed in activity?"
//        assertNotNull(message, activity.findViewById<TextView>(R.id.text_view))
//    }
//
//    @Test
//    fun testShouldCheckSliderListenerFirst() {
//        val activity = activityController.setup().get()
//        val slider = activity.findViewById<Slider>(R.id.slider)
//
//        val message = "does view with id \"slider\" placed in activity?"
//        assertNotNull(message, slider)
//
//        slider.value = 15f
//        val message2 = "\"text_view\" should be empty due to the missing data"
//        assertTrue(message2, activity.findViewById<TextView>(R.id.text_view).text.isNullOrEmpty())
//    }
//
//    @Test
//    fun testShouldCheckEditTextListenerFirst() {
//        val activity = activityController.setup().get()
//        val editText = activity.findViewById<EditText>(R.id.edit_text)
//        val textView = activity.findViewById<TextView>(R.id.text_view)
//
//        val message = "does view with id \"edit_text\" placed in activity?"
//        assertNotNull(message, editText)
//
//        editText.setText("39.39")
//        val message2 = "\"text_view\" should contain formatted output"
//        val output = "Tip amount: 0.00"
//        assertEquals(message2, output, textView.text)
//    }
//
//    @Test
//    fun testShouldCheckSliderListenerLast() {
//        val activity = activityController.setup().get()
//        val editText = activity.findViewById<EditText>(R.id.edit_text)
//        val textView = activity.findViewById<TextView>(R.id.text_view)
//        val slider = activity.findViewById<Slider>(R.id.slider)
//
//        val message1 = "does view with id \"edit_text\" placed in activity?"
//        assertNotNull(message1, editText)
//
//        val message2 = "does view with id \"slider\" placed in activity?"
//        assertNotNull(message2, slider)
//
//        editText.setText("39.39")
//        slider.value = 90f
//
//        val message3 = "\"text_view\" should contain formatted output"
//        val output = "Tip amount: 35.45"
//        assertEquals(message3, output, textView.text)
//    }
//
//    @Test
//    fun testShouldCheckEditTextListenerLast() {
//        val activity = activityController.setup().get()
//        val editText = activity.findViewById<EditText>(R.id.edit_text)
//        val textView = activity.findViewById<TextView>(R.id.text_view)
//        val slider = activity.findViewById<Slider>(R.id.slider)
//
//        val message1 = "does view with id \"edit_text\" placed in activity?"
//        assertNotNull(message1, editText)
//
//        val message2 = "does view with id \"slider\" placed in activity?"
//        assertNotNull(message2, slider)
//
//        slider.value = 90f
//        editText.setText("69.39")
//
//        val message3 = "\"text_view\" should contain formatted output"
//        val output = "Tip amount: 62.45"
//        assertEquals(message3, output, textView.text)
//    }
//
//    @Test
//    fun testShouldCheckLongJustForFun() {
//        val activity = activityController.setup().get()
//        val editText = activity.findViewById<EditText>(R.id.edit_text)
//        val textView = activity.findViewById<TextView>(R.id.text_view)
//
//        val message1 = "does view with id \"edit_text\" placed in activity?"
//        assertNotNull(message1, editText)
//
//        editText.setText("3939393939393939.6969") // Double
//
//        val message3 = "\"edit_text\" should process values greater than 2^31−1(2_147_483_647)"
//        val output = "Tip amount: 0.00"
//        assertEquals(message3, output, textView.text)
//    }
//}