/*
 * (c) ACME 2025, all rights reserved
 */

@Library('utilities@stable')

import com.escrypt.kms.infrastructure.jenkins.utilities.*

//======== COMMON PROJECT CONFIGURATION ========
//you have to use the ID provided by the RBEI OSS scan team
String projectName = "AAA"

Foo context = Foo.createFoo(env, steps, currentBuild, docker)

