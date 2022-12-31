@file:JvmName("Adapters")
@file:Suppress("NOTHING_TO_INLINE")

package dev.fastmc.allocfix.util

import net.minecraft.util.math.Matrix4f
import net.minecraft.util.math.Quaternion

inline fun Quaternion.toJoml(): org.joml.Quaternionf {
    return org.joml.Quaternionf(x, y, z, w)
}

inline fun Quaternion.toJoml(dest: org.joml.Quaternionf): org.joml.Quaternionf {
    return dest.set(x, y, z, w)
}

fun Matrix4f.toJoml(dest: org.joml.Matrix4f): org.joml.Matrix4f {
    dest.m00(this.a00)
    dest.m01(this.a10)
    dest.m02(this.a20)
    dest.m03(this.a30)
    dest.m10(this.a01)
    dest.m11(this.a11)
    dest.m12(this.a21)
    dest.m13(this.a31)
    dest.m20(this.a02)
    dest.m21(this.a12)
    dest.m22(this.a22)
    dest.m23(this.a32)
    dest.m30(this.a03)
    dest.m31(this.a13)
    dest.m32(this.a23)
    dest.m33(this.a33)

    return dest
}

fun Matrix4f.toJoml(): org.joml.Matrix4f {
    return org.joml.Matrix4f(
        this.a00,
        this.a10,
        this.a20,
        this.a30,
        this.a01,
        this.a11,
        this.a21,
        this.a31,
        this.a02,
        this.a12,
        this.a22,
        this.a32,
        this.a03,
        this.a13,
        this.a23,
        this.a33,
    )
}