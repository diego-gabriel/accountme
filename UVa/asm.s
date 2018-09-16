	.file	"11576.cpp"
	.section	.text._ZNSt11char_traitsIcE7compareEPKcS2_j,"axG",@progbits,_ZNSt11char_traitsIcE7compareEPKcS2_j,comdat
	.weak	_ZNSt11char_traitsIcE7compareEPKcS2_j
	.type	_ZNSt11char_traitsIcE7compareEPKcS2_j, @function
_ZNSt11char_traitsIcE7compareEPKcS2_j:
.LFB193:
	.cfi_startproc
	pushl	%ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	movl	%esp, %ebp
	.cfi_def_cfa_register 5
	subl	$24, %esp
	movl	16(%ebp), %eax
	movl	%eax, 8(%esp)
	movl	12(%ebp), %eax
	movl	%eax, 4(%esp)
	movl	8(%ebp), %eax
	movl	%eax, (%esp)
	call	memcmp
	leave
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
.LFE193:
	.size	_ZNSt11char_traitsIcE7compareEPKcS2_j, .-_ZNSt11char_traitsIcE7compareEPKcS2_j
	.local	_ZStL8__ioinit
	.comm	_ZStL8__ioinit,1,1
	.text
	.globl	_Z9maxSuffixSsSs
	.type	_Z9maxSuffixSsSs, @function
_Z9maxSuffixSsSs:
.LFB1230:
	.cfi_startproc
	.cfi_personality 0,__gxx_personality_v0
	.cfi_lsda 0,.LLSDA1230
	pushl	%ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	movl	%esp, %ebp
	.cfi_def_cfa_register 5
	pushl	%ebx
	subl	$36, %esp
	.cfi_offset 3, -12
	movl	$0, -12(%ebp)
	movl	8(%ebp), %eax
	movl	%eax, (%esp)
.LEHB0:
	call	_ZNKSs6lengthEv
	movl	%eax, %edx
	leal	-16(%ebp), %eax
	movl	%edx, 12(%esp)
	movl	$0, 8(%esp)
	movl	12(%ebp), %edx
	movl	%edx, 4(%esp)
	movl	%eax, (%esp)
	call	_ZNKSs6substrEjj
.LEHE0:
	subl	$4, %esp
	movl	8(%ebp), %eax
	movl	%eax, 4(%esp)
	leal	-16(%ebp), %eax
	movl	%eax, (%esp)
.LEHB1:
	call	_ZSteqIcEN9__gnu_cxx11__enable_ifIXsrSt9__is_charIT_E7__valueEbE6__typeERKSbIS3_St11char_traitsIS3_ESaIS3_EESC_
.LEHE1:
	movl	%eax, %ebx
	leal	-16(%ebp), %eax
	movl	%eax, (%esp)
.LEHB2:
	call	_ZNSsD1Ev
	testb	%bl, %bl
	je	.L4
	movl	8(%ebp), %eax
	movl	%eax, (%esp)
	call	_ZNKSs6lengthEv
	movl	%eax, -12(%ebp)
	jmp	.L5
.L4:
	movl	12(%ebp), %eax
	movl	%eax, 4(%esp)
	leal	-16(%ebp), %eax
	movl	%eax, (%esp)
	call	_ZNSsC1ERKSs
.LEHE2:
	leal	-20(%ebp), %eax
	movl	$-1, 12(%esp)
	movl	$1, 8(%esp)
	movl	8(%ebp), %edx
	movl	%edx, 4(%esp)
	movl	%eax, (%esp)
.LEHB3:
	call	_ZNKSs6substrEjj
.LEHE3:
	subl	$4, %esp
	leal	-16(%ebp), %eax
	movl	%eax, 4(%esp)
	leal	-20(%ebp), %eax
	movl	%eax, (%esp)
.LEHB4:
	call	_Z9maxSuffixSsSs
.LEHE4:
	movl	%eax, -12(%ebp)
	leal	-20(%ebp), %eax
	movl	%eax, (%esp)
.LEHB5:
	call	_ZNSsD1Ev
.LEHE5:
	leal	-16(%ebp), %eax
	movl	%eax, (%esp)
.LEHB6:
	call	_ZNSsD1Ev
.LEHE6:
.L5:
	movl	-12(%ebp), %eax
	jmp	.L13
.L10:
	movl	%eax, %ebx
	leal	-16(%ebp), %eax
	movl	%eax, (%esp)
	call	_ZNSsD1Ev
	movl	%ebx, %eax
	movl	%eax, (%esp)
.LEHB7:
	call	_Unwind_Resume
.LEHE7:
.L12:
	movl	%eax, %ebx
	leal	-20(%ebp), %eax
	movl	%eax, (%esp)
	call	_ZNSsD1Ev
	jmp	.L9
.L11:
	movl	%eax, %ebx
.L9:
	leal	-16(%ebp), %eax
	movl	%eax, (%esp)
	call	_ZNSsD1Ev
	movl	%ebx, %eax
	movl	%eax, (%esp)
.LEHB8:
	call	_Unwind_Resume
.LEHE8:
.L13:
	movl	-4(%ebp), %ebx
	leave
	.cfi_restore 5
	.cfi_restore 3
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
.LFE1230:
	.globl	__gxx_personality_v0
	.section	.gcc_except_table,"a",@progbits
.LLSDA1230:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE1230-.LLSDACSB1230
.LLSDACSB1230:
	.uleb128 .LEHB0-.LFB1230
	.uleb128 .LEHE0-.LEHB0
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB1-.LFB1230
	.uleb128 .LEHE1-.LEHB1
	.uleb128 .L10-.LFB1230
	.uleb128 0
	.uleb128 .LEHB2-.LFB1230
	.uleb128 .LEHE2-.LEHB2
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB3-.LFB1230
	.uleb128 .LEHE3-.LEHB3
	.uleb128 .L11-.LFB1230
	.uleb128 0
	.uleb128 .LEHB4-.LFB1230
	.uleb128 .LEHE4-.LEHB4
	.uleb128 .L12-.LFB1230
	.uleb128 0
	.uleb128 .LEHB5-.LFB1230
	.uleb128 .LEHE5-.LEHB5
	.uleb128 .L11-.LFB1230
	.uleb128 0
	.uleb128 .LEHB6-.LFB1230
	.uleb128 .LEHE6-.LEHB6
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB7-.LFB1230
	.uleb128 .LEHE7-.LEHB7
	.uleb128 0
	.uleb128 0
	.uleb128 .LEHB8-.LFB1230
	.uleb128 .LEHE8-.LEHB8
	.uleb128 0
	.uleb128 0
.LLSDACSE1230:
	.text
	.size	_Z9maxSuffixSsSs, .-_Z9maxSuffixSsSs
	.section	.rodata
.LC0:
	.string	"   "
	.text
	.globl	main
	.type	main, @function
main:
.LFB1231:
	.cfi_startproc
	.cfi_personality 0,__gxx_personality_v0
	.cfi_lsda 0,.LLSDA1231
	pushl	%ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	movl	%esp, %ebp
	.cfi_def_cfa_register 5
	pushl	%ebx
	andl	$-16, %esp
	subl	$64, %esp
	.cfi_offset 3, -12
	leal	28(%esp), %eax
	movl	%eax, 4(%esp)
	movl	$_ZSt3cin, (%esp)
.LEHB9:
	call	_ZNSirsERi
.LEHE9:
	jmp	.L15
.L18:
	leal	32(%esp), %eax
	movl	%eax, (%esp)
.LEHB10:
	call	_ZNSsC1Ev
.LEHE10:
	leal	36(%esp), %eax
	movl	%eax, (%esp)
.LEHB11:
	call	_ZNSsC1Ev
.LEHE11:
	movl	$0, 56(%esp)
	leal	40(%esp), %eax
	movl	%eax, 4(%esp)
	movl	$_ZSt3cin, (%esp)
.LEHB12:
	call	_ZNSirsERi
	leal	44(%esp), %edx
	movl	%edx, 4(%esp)
	movl	%eax, (%esp)
	call	_ZNSirsERi
	movl	$.LC0, 4(%esp)
	leal	36(%esp), %eax
	movl	%eax, (%esp)
	call	_ZNSsaSEPKc
	movl	$0, 60(%esp)
	jmp	.L16
.L17:
	leal	32(%esp), %eax
	movl	%eax, 4(%esp)
	movl	$_ZSt3cin, (%esp)
	call	_ZStrsIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E
	movl	40(%esp), %ebx
	leal	32(%esp), %eax
	movl	%eax, 4(%esp)
	leal	52(%esp), %eax
	movl	%eax, (%esp)
	call	_ZNSsC1ERKSs
.LEHE12:
	leal	36(%esp), %eax
	movl	%eax, 4(%esp)
	leal	48(%esp), %eax
	movl	%eax, (%esp)
.LEHB13:
	call	_ZNSsC1ERKSs
.LEHE13:
	leal	52(%esp), %eax
	movl	%eax, 4(%esp)
	leal	48(%esp), %eax
	movl	%eax, (%esp)
.LEHB14:
	call	_Z9maxSuffixSsSs
.LEHE14:
	movl	%ebx, %edx
	subl	%eax, %edx
	movl	%edx, %eax
	addl	%eax, 56(%esp)
	leal	48(%esp), %eax
	movl	%eax, (%esp)
.LEHB15:
	call	_ZNSsD1Ev
.LEHE15:
	leal	52(%esp), %eax
	movl	%eax, (%esp)
.LEHB16:
	call	_ZNSsD1Ev
	leal	32(%esp), %eax
	movl	%eax, 4(%esp)
	leal	36(%esp), %eax
	movl	%eax, (%esp)
	call	_ZNSsaSERKSs
	addl	$1, 60(%esp)
.L16:
	movl	44(%esp), %eax
	cmpl	%eax, 60(%esp)
	setl	%al
	testb	%al, %al
	jne	.L17
	movl	56(%esp), %eax
	movl	%eax, 4(%esp)
	movl	$_ZSt4cout, (%esp)
	call	_ZNSolsEi
	movl	$_ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_, 4(%esp)
	movl	%eax, (%esp)
	call	_ZNSolsEPFRSoS_E
.LEHE16:
	leal	36(%esp), %eax
	movl	%eax, (%esp)
.LEHB17:
	call	_ZNSsD1Ev
.LEHE17:
	leal	32(%esp), %eax
	movl	%eax, (%esp)
.LEHB18:
	call	_ZNSsD1Ev
.LEHE18:
.L15:
	movl	28(%esp), %eax
	testl	%eax, %eax
	setne	%dl
	subl	$1, %eax
	movl	%eax, 28(%esp)
	testb	%dl, %dl
	jne	.L18
	movl	$0, %eax
	jmp	.L32
.L31:
	movl	%eax, %ebx
	leal	48(%esp), %eax
	movl	%eax, (%esp)
	call	_ZNSsD1Ev
	jmp	.L21
.L30:
	movl	%eax, %ebx
.L21:
	leal	52(%esp), %eax
	movl	%eax, (%esp)
	call	_ZNSsD1Ev
	jmp	.L22
.L29:
	movl	%eax, %ebx
.L22:
	leal	36(%esp), %eax
	movl	%eax, (%esp)
	call	_ZNSsD1Ev
	jmp	.L23
.L28:
	movl	%eax, %ebx
.L23:
	leal	32(%esp), %eax
	movl	%eax, (%esp)
	call	_ZNSsD1Ev
	movl	%ebx, %eax
	jmp	.L24
.L27:
.L24:
	jmp	.L25
.L26:
.L25:
	movl	%eax, (%esp)
.LEHB19:
	call	_Unwind_Resume
.LEHE19:
.L32:
	movl	-4(%ebp), %ebx
	leave
	.cfi_restore 5
	.cfi_restore 3
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
.LFE1231:
	.section	.gcc_except_table
.LLSDA1231:
	.byte	0xff
	.byte	0xff
	.byte	0x1
	.uleb128 .LLSDACSE1231-.LLSDACSB1231
.LLSDACSB1231:
	.uleb128 .LEHB9-.LFB1231
	.uleb128 .LEHE9-.LEHB9
	.uleb128 .L26-.LFB1231
	.uleb128 0
	.uleb128 .LEHB10-.LFB1231
	.uleb128 .LEHE10-.LEHB10
	.uleb128 .L27-.LFB1231
	.uleb128 0
	.uleb128 .LEHB11-.LFB1231
	.uleb128 .LEHE11-.LEHB11
	.uleb128 .L28-.LFB1231
	.uleb128 0
	.uleb128 .LEHB12-.LFB1231
	.uleb128 .LEHE12-.LEHB12
	.uleb128 .L29-.LFB1231
	.uleb128 0
	.uleb128 .LEHB13-.LFB1231
	.uleb128 .LEHE13-.LEHB13
	.uleb128 .L30-.LFB1231
	.uleb128 0
	.uleb128 .LEHB14-.LFB1231
	.uleb128 .LEHE14-.LEHB14
	.uleb128 .L31-.LFB1231
	.uleb128 0
	.uleb128 .LEHB15-.LFB1231
	.uleb128 .LEHE15-.LEHB15
	.uleb128 .L30-.LFB1231
	.uleb128 0
	.uleb128 .LEHB16-.LFB1231
	.uleb128 .LEHE16-.LEHB16
	.uleb128 .L29-.LFB1231
	.uleb128 0
	.uleb128 .LEHB17-.LFB1231
	.uleb128 .LEHE17-.LEHB17
	.uleb128 .L28-.LFB1231
	.uleb128 0
	.uleb128 .LEHB18-.LFB1231
	.uleb128 .LEHE18-.LEHB18
	.uleb128 .L27-.LFB1231
	.uleb128 0
	.uleb128 .LEHB19-.LFB1231
	.uleb128 .LEHE19-.LEHB19
	.uleb128 0
	.uleb128 0
.LLSDACSE1231:
	.text
	.size	main, .-main
	.section	.text._ZSteqIcEN9__gnu_cxx11__enable_ifIXsrSt9__is_charIT_E7__valueEbE6__typeERKSbIS3_St11char_traitsIS3_ESaIS3_EESC_,"axG",@progbits,_ZSteqIcEN9__gnu_cxx11__enable_ifIXsrSt9__is_charIT_E7__valueEbE6__typeERKSbIS3_St11char_traitsIS3_ESaIS3_EESC_,comdat
	.weak	_ZSteqIcEN9__gnu_cxx11__enable_ifIXsrSt9__is_charIT_E7__valueEbE6__typeERKSbIS3_St11char_traitsIS3_ESaIS3_EESC_
	.type	_ZSteqIcEN9__gnu_cxx11__enable_ifIXsrSt9__is_charIT_E7__valueEbE6__typeERKSbIS3_St11char_traitsIS3_ESaIS3_EESC_, @function
_ZSteqIcEN9__gnu_cxx11__enable_ifIXsrSt9__is_charIT_E7__valueEbE6__typeERKSbIS3_St11char_traitsIS3_ESaIS3_EESC_:
.LFB1241:
	.cfi_startproc
	pushl	%ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	movl	%esp, %ebp
	.cfi_def_cfa_register 5
	pushl	%esi
	pushl	%ebx
	subl	$16, %esp
	.cfi_offset 6, -12
	.cfi_offset 3, -16
	movl	8(%ebp), %eax
	movl	%eax, (%esp)
	call	_ZNKSs4sizeEv
	movl	%eax, %ebx
	movl	12(%ebp), %eax
	movl	%eax, (%esp)
	call	_ZNKSs4sizeEv
	cmpl	%eax, %ebx
	jne	.L34
	movl	8(%ebp), %eax
	movl	%eax, (%esp)
	call	_ZNKSs4sizeEv
	movl	%eax, %esi
	movl	12(%ebp), %eax
	movl	%eax, (%esp)
	call	_ZNKSs4dataEv
	movl	%eax, %ebx
	movl	8(%ebp), %eax
	movl	%eax, (%esp)
	call	_ZNKSs4dataEv
	movl	%esi, 8(%esp)
	movl	%ebx, 4(%esp)
	movl	%eax, (%esp)
	call	_ZNSt11char_traitsIcE7compareEPKcS2_j
	testl	%eax, %eax
	jne	.L34
	movl	$1, %eax
	jmp	.L35
.L34:
	movl	$0, %eax
.L35:
	addl	$16, %esp
	popl	%ebx
	.cfi_restore 3
	popl	%esi
	.cfi_restore 6
	popl	%ebp
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
.LFE1241:
	.size	_ZSteqIcEN9__gnu_cxx11__enable_ifIXsrSt9__is_charIT_E7__valueEbE6__typeERKSbIS3_St11char_traitsIS3_ESaIS3_EESC_, .-_ZSteqIcEN9__gnu_cxx11__enable_ifIXsrSt9__is_charIT_E7__valueEbE6__typeERKSbIS3_St11char_traitsIS3_ESaIS3_EESC_
	.text
	.type	_Z41__static_initialization_and_destruction_0ii, @function
_Z41__static_initialization_and_destruction_0ii:
.LFB1287:
	.cfi_startproc
	pushl	%ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	movl	%esp, %ebp
	.cfi_def_cfa_register 5
	subl	$24, %esp
	cmpl	$1, 8(%ebp)
	jne	.L37
	cmpl	$65535, 12(%ebp)
	jne	.L37
	movl	$_ZStL8__ioinit, (%esp)
	call	_ZNSt8ios_base4InitC1Ev
	movl	$__dso_handle, 8(%esp)
	movl	$_ZStL8__ioinit, 4(%esp)
	movl	$_ZNSt8ios_base4InitD1Ev, (%esp)
	call	__cxa_atexit
.L37:
	leave
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
.LFE1287:
	.size	_Z41__static_initialization_and_destruction_0ii, .-_Z41__static_initialization_and_destruction_0ii
	.type	_GLOBAL__sub_I__Z9maxSuffixSsSs, @function
_GLOBAL__sub_I__Z9maxSuffixSsSs:
.LFB1288:
	.cfi_startproc
	pushl	%ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	movl	%esp, %ebp
	.cfi_def_cfa_register 5
	subl	$24, %esp
	movl	$65535, 4(%esp)
	movl	$1, (%esp)
	call	_Z41__static_initialization_and_destruction_0ii
	leave
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
.LFE1288:
	.size	_GLOBAL__sub_I__Z9maxSuffixSsSs, .-_GLOBAL__sub_I__Z9maxSuffixSsSs
	.section	.init_array,"aw"
	.align 4
	.long	_GLOBAL__sub_I__Z9maxSuffixSsSs
	.section	.rodata
	.align 4
	.type	_ZZL18__gthread_active_pvE20__gthread_active_ptr, @object
	.size	_ZZL18__gthread_active_pvE20__gthread_active_ptr, 4
_ZZL18__gthread_active_pvE20__gthread_active_ptr:
	.long	_ZL22__gthrw_pthread_cancelm
	.weakref	_ZL22__gthrw_pthread_cancelm,pthread_cancel
	.hidden	__dso_handle
	.ident	"GCC: (Ubuntu/Linaro 4.7.2-2ubuntu1) 4.7.2"
	.section	.note.GNU-stack,"",@progbits
