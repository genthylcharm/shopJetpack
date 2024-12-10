package com.dvl.shoponline.Model

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.dvl.shoponline.R

@Composable
fun PopularItem(items: List<ItemsModel>, pos: Int) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .padding(8.dp)
            .wrapContentHeight()
    ) {
        AsyncImage(
            model = items[pos].picUrl.firstOrNull(),
            contentDescription = items[pos].title,
            modifier = Modifier
                .width(175.dp)
                .background(colorResource(R.color.lightBrown), shape = RoundedCornerShape(10.dp))
                .height(195.dp)
                .clickable {

                }, contentScale = ContentScale.Crop
        )
        Text(text = items[pos].title, color = Color.Black, fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(top = 8.dp)

        )
        Row  (modifier = Modifier.width(175.dp).padding(top=4.dp)){

        }

    }
}