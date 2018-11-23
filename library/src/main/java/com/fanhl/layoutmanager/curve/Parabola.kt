package com.fanhl.layoutmanager.curve

import com.fanhl.layoutmanager.CurveLayoutManger

/** 抛物线 */
class Parabola : CurveLayoutManger.Curve {
    override fun getInterpolation(
        i: Float,
        position: CurveLayoutManger.Vector2
    ) {
        position.apply {
            x = i + 0.5f
            y = .2f * i * i + 0.5f
        }
    }
}