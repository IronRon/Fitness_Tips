package com.example.fitnesstips.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.fitnesstips.R

data class FitTip(
    @DrawableRes val imageResourceId: Int,
    val day:Int,
    @StringRes val tipTitle: Int,
    @StringRes val tipText: Int
)

val fitTips = listOf(
    FitTip(R.drawable.bicep_curls, 1, R.string.summary_goal_1, R.string.goal_1_text),
    FitTip(R.drawable.triceps_extension, 2, R.string.summary_goal_2, R.string.goal_2_text),
    FitTip(R.drawable.squat, 3, R.string.summary_goal_3, R.string.goal_3_text),
    FitTip(R.drawable.lat_pulldown, 4, R.string.summary_goal_4, R.string.goal_4_text),
    FitTip(R.drawable.incline_dumbell_press, 5, R.string.summary_goal_5, R.string.goal_5_text),
    FitTip(R.drawable.seated_cable_row, 6, R.string.summary_goal_6, R.string.goal_6_text),
    FitTip(R.drawable.lat_pullover, 7, R.string.summary_goal_7, R.string.goal_7_text),
    FitTip(R.drawable.cable_rope_hammer_curl, 8, R.string.summary_goal_8, R.string.goal_8_text),
    FitTip(R.drawable.leg_extension_1024x541, 9, R.string.summary_goal_9, R.string.goal_9_text),
    FitTip(R.drawable.shoulder_press_jpg, 10, R.string.summary_goal_10, R.string.goal_10_text),
    FitTip(R.drawable.seated_dumbbell_lateral_raise, 11, R.string.summary_goal_11, R.string.goal_11_text),
    FitTip(R.drawable.cable_face_pull_muscles_1024x482, 12, R.string.summary_goal_12, R.string.goal_12_text),
    FitTip(R.drawable.pull_ups, 13, R.string.summary_goal_13, R.string.goal_13_text),
    FitTip(R.drawable.tricep_dip_muscles, 14, R.string.summary_goal_14, R.string.goal_14_text),
    FitTip(R.drawable.preachercurls, 15, R.string.summary_goal_15, R.string.goal_15_text),
)
