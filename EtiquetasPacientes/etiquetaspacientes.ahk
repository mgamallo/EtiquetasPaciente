IfWinExist, clinica - TNVTPlus,,,
{
	GroupAdd, GrupoWinClinica, ahk_class clinica - TNVTPlus,,,
	WinGet, clinica1, ID, clinica - TNVTPlus,,,
	GroupActivate, GrupoWinClinica,
}

F7::
	WinActivate, clinica - TNVTPlus,,,
	WinMaximize, ahk_id %clinica1%,,,
	WinSet, AlwaysOnTop, On, ahk_id %clinica1%

return


F8::
	WinActivate, clinica - TNVTPlus,,,
	WinMinimize, ahk_id %clinica1%,,,
	WinSet, AlwaysOnTop, Off, ahk_id %clinica1%

return