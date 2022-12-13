package dev.fastmc.allocfix.mixins.main.render;

import dev.fastmc.allocfix.mixins.IPatchedVertexConsumer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.FixedColorVertexConsumer;
import net.minecraft.client.render.SpriteTexturedVertexConsumer;
import net.minecraft.util.math.Vec3f;
import net.minecraft.util.math.Vector4f;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = { BufferBuilder.class, FixedColorVertexConsumer.class, SpriteTexturedVertexConsumer.class })
public class MixinVertexConsumerImpls implements IPatchedVertexConsumer {
    private final Vector4f vec4f = new Vector4f();
    private final Vec3f vec3f = new Vec3f();

    @NotNull
    @Override
    public Vector4f getVec4f() {
        return vec4f;
    }

    @NotNull
    @Override
    public Vec3f getVec3f() {
        return vec3f;
    }
}