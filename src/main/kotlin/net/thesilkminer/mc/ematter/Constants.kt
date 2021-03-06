/*
 * Copyright (C) 2020  TheSilkMiner
 *
 * This file is part of Boson.
 *
 * Boson is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Boson is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Boson.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Contact information:
 * E-mail: thesilkminer <at> outlook <dot> com
 */

@file:JvmName("C")

package net.thesilkminer.mc.ematter

import net.thesilkminer.mc.boson.api.modid.BOSON
import net.thesilkminer.mc.boson.api.modid.ENERGY_IS_MATTER

internal const val MOD_ID = ENERGY_IS_MATTER
internal const val MOD_NAME = "Energy's Matter"
internal const val MOD_VERSION = "@ENERGY_IS_MATTER_VERSION@"
internal const val MOD_MC_VERSION = "1.12.2"
internal const val MOD_CERTIFICATE_FINGERPRINT = "@FINGERPRINT@"
internal const val MOD_CHANNEL_ID = MOD_ID

internal const val MOD_DEPENDENCIES = "required-after:forge@[14.23.5.2768,);" +
        "required-after:$BOSON" /*+ "@[@BOSON_VERSION@,)"*/

@Suppress("SpellCheckingInspection")
internal const val KOTLIN_LANGUAGE_ADAPTER = "net.shadowfacts.forgelin.KotlinAdapter"
