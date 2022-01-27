package co.com.esteban.continuousdelivery

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

const val ROW_TAG = "dotsFirstRow"
const val BOX_TAG = "dotBox"

@Composable
fun SequentialDots(selected: Int, amountDots: Int, selectedColor: Color) {
    Row(Modifier.testTag(ROW_TAG)) {

        repeat(amountDots) {
            val testTagDot = "$BOX_TAG-$it"
            val finalWidth = if(selected == it){
                30.dp
            } else{
                4.dp
            }
            val modifier = Modifier
                .padding(1.dp)
                .height(4.dp)
                .width(finalWidth)
                .clip(CircleShape)
                .background(selectedColor)
            Box(
                modifier = modifier
                    .testTag(testTagDot)

            )
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 320,
    heightDp = 100
)
@Composable
fun SequentialDotsPreview() {
    SequentialDots(0, 3, Color.Blue)
}