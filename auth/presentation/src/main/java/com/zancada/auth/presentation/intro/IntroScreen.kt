package com.zancada.auth.presentation.intro

import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zancada.auth.presentation.R
import com.zancada.core.presentation.designsystem.LogoIcon
import com.zancada.core.presentation.designsystem.ZancadaTheme
import com.zancada.core.presentation.designsystem.components.GradientBackground
import com.zancada.core.presentation.designsystem.components.ZancadaActionButton
import com.zancada.core.presentation.designsystem.components.ZancadaOutlineActionButton

@Composable
fun IntroScreenRoot(
    onSignUpClick: () -> Unit,
    onSignInClick: () -> Unit
) {
    IntroScreen { action ->
        when(action) {
            IntroAction.OnSignInClick -> onSignInClick()
            IntroAction.OnSignUpClick -> onSignUpClick()
        }
    }
}

@Composable
fun IntroScreen(
    onAction: (IntroAction) -> Unit
) {
    GradientBackground {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            ZancadaLogoVertical()
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .padding(bottom = 48.dp),
        ) {
            Text(
                text = stringResource(id = R.string.welcome_to_zancada),
                color = MaterialTheme.colorScheme.onBackground,
                fontSize = 20.sp,
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = stringResource(id = R.string.zancada_description),
                style = MaterialTheme.typography.bodySmall,
            )
            Spacer(modifier = Modifier.height(32.dp))
            ZancadaOutlineActionButton(
                text = stringResource(id = R.string.sign_in),
                isLoading = false,
                onClick = { onAction(IntroAction.OnSignInClick) },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))
            ZancadaActionButton(
                text = stringResource(id = R.string.sign_up),
                isLoading = false,
                onClick = { onAction(IntroAction.OnSignUpClick) },
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
private fun ZancadaLogoVertical(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = LogoIcon,
            contentDescription = "Logo",
            tint = MaterialTheme.colorScheme.onBackground
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = stringResource(id = R.string.zancada),
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}

@Preview
@Composable
private fun IntroScreenPreview() {
    ZancadaTheme {
        IntroScreen(
            onAction = {}
        )
    }
}