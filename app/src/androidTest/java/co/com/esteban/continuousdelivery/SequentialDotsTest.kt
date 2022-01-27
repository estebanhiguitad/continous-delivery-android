package co.com.esteban.continuousdelivery

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.unit.dp
import org.junit.Rule
import org.junit.Test

class SequentialDotsTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    private val widthForSelectedDot = 30.dp
    private val roundUnselectedDot = 4.dp

    @Test
    fun sequentialDots_isDisplayed_rowWithTag(){
        // Arrange
        composeTestRule.setContent {
            val amountDots = 3
            val selectedColor = Color.Blue
            val selected = 0
            SequentialDots(selected, amountDots, selectedColor)
        }

        // Act
        val node = composeTestRule
            .onNodeWithTag(ROW_TAG)

        // Assert
        node.assertIsDisplayed()
    }


    @Test
    fun sequentialDots_firstDotSelected_width30dp(){
        // Arrange
        composeTestRule.setContent {
            val amountDots = 3
            val selectedColor = Color.Blue
            val selected = 0
            SequentialDots(selected, amountDots, selectedColor)
        }

        // Act
        val node : SemanticsNodeInteraction = composeTestRule
            .onNodeWithTag("$BOX_TAG-0")

        // Act
        node.assertWidthIsEqualTo(widthForSelectedDot)
    }

    @Test
    fun sequentialDots_secondDotSelected_width30dp(){
        // Arrange
        composeTestRule.setContent {
            val amountDots = 3
            val selectedColor = Color.Blue
            val selected = 1
            SequentialDots(selected, amountDots, selectedColor)
        }

        // Act
        val node : SemanticsNodeInteraction = composeTestRule
            .onNodeWithTag("$BOX_TAG-1")

        // Act
        node.assertWidthIsEqualTo(widthForSelectedDot)
    }

    @Test
    fun sequentialDots_thirdDotSelected_width30dp(){
        // Arrange
        composeTestRule.setContent {
            val amountDots = 3
            val selectedColor = Color.Blue
            val selected = 2
            SequentialDots(selected, amountDots, selectedColor)
        }

        // Act
        val node : SemanticsNodeInteraction = composeTestRule
            .onNodeWithTag(ROW_TAG)
            .onChildAt(2)

        // Act
        node.assertWidthIsEqualTo(widthForSelectedDot)
    }


    @Test
    fun sequentialDots_thirdDotSelected_firstIsRound(){
        // Arrange
        composeTestRule.setContent {
            val amountDots = 3
            val selectedColor = Color.Blue
            val selected = 2
            SequentialDots(selected, amountDots, selectedColor)
        }

        // Act
        val node : SemanticsNodeInteraction = composeTestRule
            .onNodeWithTag(ROW_TAG)
            .onChildren()
            .onFirst()

        // Act
        node.assertWidthIsEqualTo(roundUnselectedDot)
        node.assertHeightIsEqualTo(roundUnselectedDot)
    }

    @Test
    fun sequentialDots_thirdDotSelected_secondIsRound(){
        // Arrange
        composeTestRule.setContent {
            val amountDots = 3
            val selectedColor = Color.Blue
            val selected = 2
            SequentialDots(selected, amountDots, selectedColor)
        }

        // Act
        val node : SemanticsNodeInteraction = composeTestRule
            .onNodeWithTag(ROW_TAG)
            .onChildAt(1)

        // Act
        node.assertWidthIsEqualTo(roundUnselectedDot)
        node.assertHeightIsEqualTo(roundUnselectedDot)
    }

    @Test
    fun sequentialDots_secondDotSelected_thirdIsRound(){
        // Arrange
        composeTestRule.setContent {
            val amountDots = 3
            val selectedColor = Color.Blue
            val selected = 1
            SequentialDots(selected, amountDots, selectedColor)
        }

        // Act
        val node : SemanticsNodeInteraction = composeTestRule
            .onNodeWithTag(ROW_TAG)
            .onChildAt(2)

        // Act
        node.assertWidthIsEqualTo(roundUnselectedDot)
        node.assertHeightIsEqualTo(roundUnselectedDot)
    }

    @Test
    fun sequentialDots_secondDotSelected_firstIsRound(){
        // Arrange
        composeTestRule.setContent {
            val amountDots = 3
            val selectedColor = Color.Blue
            val selected = 1
            SequentialDots(selected, amountDots, selectedColor)
        }

        // Act
        val node : SemanticsNodeInteraction = composeTestRule
            .onNodeWithTag(ROW_TAG)
            .onChildren()
            .onFirst()

        // Act
        node.assertWidthIsEqualTo(roundUnselectedDot)
        node.assertHeightIsEqualTo(roundUnselectedDot)
    }

    @Test
    fun sequentialDots_firstDotSelected_thirdIsRound(){
        // Arrange
        composeTestRule.setContent {
            val amountDots = 3
            val selectedColor = Color.Blue
            val selected = 0
            SequentialDots(selected, amountDots, selectedColor)
        }

        // Act
        val node : SemanticsNodeInteraction = composeTestRule
            .onNodeWithTag(ROW_TAG)
            .onChildAt(2)

        // Act
        node.assertWidthIsEqualTo(roundUnselectedDot)
        node.assertHeightIsEqualTo(roundUnselectedDot)
    }

    @Test
    fun sequentialDots_firstDotSelected_secondIsRound(){
        // Arrange
        composeTestRule.setContent {
            val amountDots = 3
            val selectedColor = Color.Blue
            val selected = 0
            SequentialDots(selected, amountDots, selectedColor)
        }

        // Act
        val node : SemanticsNodeInteraction = composeTestRule
            .onNodeWithTag(ROW_TAG)
            .onChildAt(1)

        // Act
        node.assertWidthIsEqualTo(roundUnselectedDot)
        node.assertHeightIsEqualTo(roundUnselectedDot)
    }
}