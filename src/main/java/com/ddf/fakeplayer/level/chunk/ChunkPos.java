package com.ddf.fakeplayer.level.chunk;

import com.ddf.fakeplayer.block.BlockPos;

public class ChunkPos {
    public static final ChunkPos INVALID = new ChunkPos(0x80000000, 0x80000000);

    public int x;
    public int z;

    public ChunkPos() {
        this.x = 0;
        this.z = 0;
    }

    public ChunkPos(final BlockPos pos) {
        this.x = pos.x >> 4;
        this.z = pos.z >> 4;
    }

    public ChunkPos(int x_, int z_) {
        this.x = x_;
        this.z = z_;
    }
}
