/*
 * Copyright (C) 2015 Pedro Vicente Gomez Sanchez.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.github.pedrovgs.androidgameboyemulator.core.processor.isa;

import com.github.pedrovgs.androidgameboyemulator.core.mmu.MMU;
import com.github.pedrovgs.androidgameboyemulator.core.processor.GBZ80;
import com.github.pedrovgs.androidgameboyemulator.core.processor.Register;

public class RotateRight8BitRegisterA extends RotateRight8Bit {

  RotateRight8BitRegisterA(GBZ80 z80, MMU mmu) {
    super(z80, mmu);
  }

  @Override protected byte loadValue() {
    return z80.get8BitRegisterValue(Register.A);
  }

  @Override protected void storeValue(byte value) {
    z80.set8BitRegisterValue(Register.A, value);
  }

  @Override protected void setLastInstructionExecutionTime() {
    z80.setLastInstructionExecutionTime(1);
  }
}
